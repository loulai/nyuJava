import java.util.Scanner;

/*Author     : Louise (Lou) Lai
 *Created on : September 10th 2014
 *Description: Program computes and prints future investment. It takes 3 user
 *             inputs: investment amount, annual interest rate and number of years.
 */

public class Main {

	public static void main(String[] args) {
		
		// user is prompted for initial investment amount.
		System.out.println("Please input all values as doubles.");
		System.out.println("1. Please input the initial investment amount: ");
		Scanner input1 = new Scanner(System.in);
		double investmentAmount = input1.nextDouble();
		System.out.println("(Initial investment amount = $" + investmentAmount + ")");
		
		// user is prompted for annual interest rate.
		System.out.println("2. Please input the annual interest rate: ");
		Scanner input2 = new Scanner(System.in);
		double annualInterestRate = input2.nextDouble();
		System.out.println("(Annual interest rate = " + annualInterestRate + ")" );
		
		// user is prompted for number of years investing.
		System.out.println("3. Please input the number of years: ");
		Scanner input3 = new Scanner(System.in);
		double numberOfYears = input1.nextDouble();
		System.out.println("(Number of years = " + numberOfYears + ")");
		
		// a for loop is set up to execute 'numberOfYears' times.
		for (int i = 0; i < numberOfYears; i++){
			
			// the 'interest on the investment' is added to 'interest'
			// which is done 'numberOfYears' times, so in effect is being raised
			// to the power of 'numberOfYears'. 
			investmentAmount = investmentAmount + investmentAmount * annualInterestRate; 
			
			// prints out investment amount at the end of each year.
			System.out.println("year "+ (i+1) +": $" + investmentAmount);
			
			// if it is the final year, then the final amount is emphasized by to following output
			if (i == numberOfYears - 1) {
				System.out.printf("Thus, the future investment value at the end of %d years is $%f", i+1, investmentAmount);
			}
			
		}
		
	}
	
}
