/*Author     : Louise (Lou) Lai
 *Created on : September 10th 2014
 *Description: Program computes and prints future investment using the user input
 *of investment amount, annual interest rate and number of years.
 */

public class Main {

	public static void main(String[] args) {
		
		Double investmentAmount = 1000.0;
		Double annualInterestRate = 0.035;
		Double numberOfYears = 3.0;
		
		Double rate = 1.0 + annualInterestRate;
		
		Double answer = investmentAmount * rate;
		
		System.out.println(answer);
		
		for (int i = 0; i < numberOfYears; i++){
			answer = rate * rate;
			System.out.println(answer);
		}
	}
	
}
