

/*Author     : Louise (Lou) Lai
 *Created on : September 10th 2014
 *Description: Program computes the distance between points, which are input by the user
 */

public class Main {

	public static void main(String[] args) {
		
//	    System.out.println("Please input the desired x value and press enter: ");
//	    Scanner scanner = new Scanner(System.in);
//	    String StringValue = scanner.nextLine();
//	    System.out.println(StringValue);
		
		// delete once scanner is in use
		int x1 = 0;
		int y1 = 0;
		
		int x2 = 1;
		int y2 = 1;
		
		//first, calculating the distance between X and Y respectively
		//and assigning them to variables
		int distanceBetweenX = x2 - x1;
		int distanceBetweenY = y2 - y1;
		
		//second, summing the squares of the distance with an outside method
		Double squaredDistance = square(distanceBetweenX) + square(distanceBetweenY);
		
		//finally, taking the square root of the sum
	    Double finalDistance = Math.sqrt(squaredDistance);
	    
	    System.out.println(finalDistance);

	}
	
	public static double square(int value) {
		double SquaredAnswer = value * value;
		return SquaredAnswer;
	}

}
