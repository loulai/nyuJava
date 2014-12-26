package hw1;

import java.util.Scanner;

public class FutureInterest {

	public static void main(String[] args) {
		
		System.out.println("(double) investment amount, (double) annual interest rate as fraction, (int) number of years. In space separated order: ");
		Scanner in = new Scanner(System.in);
		
		double amount = in.nextDouble();
		double rate = in.nextDouble();
		int year = in.nextInt();
		
		double mult = 1 + rate;
		double futureVal;
		
		if(year == 1){
			futureVal = amount * mult;
		} else{
			for(int i = 0; i < year - 1; i++){
				mult = mult * (1+rate);
			}
			futureVal = amount * mult;
		}
		System.out.printf("\n=== The final investment value after %2s years is %4.2f ===", year, futureVal);
	}

}
