/*Author     : Louise (Lou) Lai
 *Created on : September 10th 2014
 *Description: Program prints an approximation of π (pi)
 */

public class Main {

	public static void main(String[] args) {
		
		//calculating and outputting the first version of pi
		double firstPi = 4 * (1.0 - 1.0/3.0 + 1.0/5.0 - 1.0/7.0 + 1.0/9.0 - 1.0/11.0);
		System.out.println("1st version of π: " + firstPi);

		//calculating and outputting the second version of pi
		double secondPi = 4 * (1.0 - 1.0/3.0 + 1.0/5.0 - 1.0/7.0 + 1.0/9.0 - 1.0/11.0 + 1.0/13.0);
		System.out.println("2nd version of π: " + secondPi);
		
	}
	
	
}
