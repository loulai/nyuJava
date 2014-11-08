/*Author     : Louise (Lou) Lai
 *Created on : November 5th 2014
 *Description: Program generates an array of 10 Course class objects. Then it sorts them by (a) last name, (b) course capacity.
 *@Lou Lai
 */
public class OrderedCourses {

	public static void main(String[] args) {
		
		//initializing each instance of a course
		Course course1 = new Course("Dragons", "Targaryen", 3000, 2900, "A101");
		Course course2 = new Course("Dying", "Stark", 20, 3, "B102");
		Course course3 = new Course("Nothing", "Snow", 300, 266, "C103");
		Course course4 = new Course("Hodor", "Hodor", 60, 30, "D104");
		Course course5 = new Course("Cunning", "Bayelish", 60, 55, "E105");
		Course course6 = new Course("Greatness", "Lannister", 10000, 9999, "F106");
		Course course7 = new Course("Dollaz", "Lannister", 4, 2, "G107");
		Course course8 = new Course("Feminism", "Tarth", 50, 45, "H108");
		Course course9 = new Course("Fire", "Red", 40, 2, "I109");
		Course course10 = new Course("Squiring", "Podrick", 25, 15, "J110");
		
		//creating an array of courses
		Course[] courseList = {course1, course2, course3, course4, course5, course6, course7, course8, course9, course10};
		
		//calling both methods
		sortByLastName(courseList);
		sortByCapacity(courseList);
	}
	
	
	/** Prints out each Course from the array of Course objects, which calls on the custom toString() method
	 * @param courseList array of Course objects
	 */
	public static void printCourseList(Course[] courseList) {
		for (int i = 0; i < courseList.length; i++){
			System.out.println(courseList[i]);
		}
	}
	
	/** Sorts the array of Course objects according to instuctor's last name (A-Z)
	 * @param courseList
	 */
	public static void sortByLastName(Course[] courseList) {
		int i;
		boolean flag = true; //set flag value to true for first loop
		Course temp; //temporary storage variable for Course to be swapped
		
		while(flag) {
			flag = false; //becomes false when the the for loop has finished executing, terminating the while loop
			/* bubble sort */
			for(i = 0; i < courseList.length - 1; i++){ 
				if(courseList[i].getInstructor().compareToIgnoreCase(courseList[i + 1].getInstructor()) > 0) { //compares characters lexicographically
					temp = courseList[i]; //stores value of object that needs to be replaced
					courseList[i] = courseList[i + 1]; //replaces object (for the 'bigger' object)
					courseList[i + 1] = temp; //takes the next value and replaces it with temp
					flag = true;
				}
			}
		}
		System.out.println("================ Sorted by Last Name =================");
		printCourseList(courseList); //calls on printCourseList method to print (documented above)
		System.out.println();
	}
	
	/** Sorts the array of Course objects according to Course's capacity (small to large). 
	 * @param courseList
	 */
	public static void sortByCapacity(Course[] courseList){
		/* bubble sort logic similar to sortByLastName */
		int i; 
		boolean flag = true;
		Course temp;
		
		while(flag){
			flag = false;
			for(i = 0; i < courseList.length - 1; i++){
				if(courseList[i].getCapacity() > courseList[i+1].getCapacity()){ //small difference: this one is bubble sort ascending (small to large), not descending.
					temp = courseList[i];
					courseList[i] = courseList[i + 1];
					courseList[i + 1] = temp;
					flag = true;
				}
			}
		}
		System.out.println("================ Sorted by Capacity ==================");
		printCourseList(courseList);
		System.out.println();
	}

}
