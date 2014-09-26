/*
 *Created on : September 23rd 2014
 *Description: Program generates a random number and uses it to generate a single card.
 *@author Lou Lai
 */

public class GetCard {

	public static void main(String[] args) {
		
		// over arching concept: modulus finds position within suit. Integer division finds suit.
		
		// generating a random integer between 1 and 52. Must add one for modulus logic to work. 
		// i.e. if generated number = 1, then 1 mod 13 equals 1. This makes it an ace. When x mod 13 equals 0
		// (e.g. 13 mod 13 or 36 mod 13), it marks the last position within their suit. 
		int number = (int) (Math.random() * 52) + 1;
		
		// identifies and prints the card position within the suit according to mod 13 result.
		// note that cards are shuffled for convenience. e.g. Values 2 to 10 appear between the 2nd and 10th index position,
		// and are not in the traditional 10 to 2 ordering.
		if (number % 13 == 1){
			System.out.print("Ace");
		} else if (number % 13 == 11){
			System.out.print("King");
		} else if (number % 13 == 12) {
			System.out.print("Queen");
		} else if (number % 13 == 0) {
			System.out.print("Jack");
		} else {
			// When in the second, third and fourth suit, 13, 26 or 39 must be subtracted respectively from the index so the correct card number is printed
			// the formula will make more sense after integer division approach is explained*
			int numericalValue = number - (((number - 1)/13) * 13);
			System.out.print(numericalValue);
		}
		
		// 1 must be subtracted to the generated number. Possible values of 'number' are now 0 to 51, not 1 to 52.
		// (52 / 4) = 4, which is equivalent to making another suit. e.g. if 5 is divided by 13, because it's integer division,
		// the value will be 0. Thus, if you take any value between 0 and 51 (not 52) and divide by 13, you will only ever get
		// 0, 1, 2 and 3. This corresponds nicely to the four suits.
		number = number - 1;
		
		if (number / 13 == 0) {
			System.out.print(" of hearts");
		} else if (number / 13 == 1) {
			System.out.print(" of spades");
		} else if (number / 13 == 2) {
			System.out.print(" of clubs");
		} else {
			System.out.print(" of diamonds");
		}
		
	}

}
