
public class OrderedCourses {

	public static void main(String[] args) {
		
		Course course1 = new Course("Dragons", "Targaryen", 3000, 2900, "101");
		Course course2 = new Course("Dying", "Stark", 20, 3, "102");
		Course course3 = new Course("Nothing", "Snow", 300, 266, "103");
		Course course4 = new Course("Hodor", "Hodor", 60, 30, "104");
		Course course5 = new Course("Cunning", "Bayelish", 60, 55, "105");
		Course course6 = new Course("Greatness", "Lannister", 10000, 9999, "106");
		Course course7 = new Course("Money Is Everything", "Lannister", 4, 2, "107");
		Course course8 = new Course("Feminism", "Tarth", 50, 45, "108");
		Course course9 = new Course("Fire", "Red", 40, 2, "109");
		Course course10 = new Course("Squiring", "Podrick", 25, 15, "110");
		
		Course[] courseList = {course1, course2, course3, course4, course5, course6, course7, course8, course9, course10};

		printOut(courseList);
	}
	
	public Course[] sortByLastName(Course[] courseList) {
		
		int i;
		boolean flag = true;
		Course temp;
		
		while(flag) {
			flag = false;
			for(i = 0; i < courseList.length - 1; i++){
				if(courseList[i].getInstructor().compareToIgnoreCase(courseList[i + 1].getInstructor()) > 0) {
					temp = courseList[i];
					courseList[i] = courseList[i + 1];
					courseList[i + 1] = temp;
					flag = true;
				}
			}
		}
		return courseList;
	}
	
	public static void printOut( Course[] courseList) {
		for(int i = 0; i < courseList.length; i++){
			System.out.println(courseList[i].getInstructor());
		}
	}

}
