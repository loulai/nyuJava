/*Author     : Louise (Lou) Lai
 *Created on : September 23rd 2014
 *Description: Program generates a random number and uses it to generate a single card.
 */

public class GetCard {

	public static void main(String[] args) {
		
		int number = (int) (Math.random() * 52);

		System.out.println("The random number, before adding anything: " + number); //delete for final
		
		number = number + 1;
		
		if (number % 13 == 1){
			System.out.print("Ace");
		} else if (number % 13 == 11){
			System.out.print("King");
		} else if (number % 13 == 12) {
		System.out.print("Queen");
		} else if (number % 13 == 0) {
			System.out.print("Jack");
		} else {
			int numericalValue = number - (((number - 1)/13) * 13);
			System.out.print(numericalValue);
		}
		
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
