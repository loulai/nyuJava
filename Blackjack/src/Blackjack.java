import java.util.Scanner;

/*Author     : Louise (Lou) Lai
 *Created on : September 23rd 2014
 *Description: 
 */

public class Blackjack {

	public static void main(String[] args) {
		
		int userCardNumber1 = generateNumber();
		int userCardNumber2 = generateNumber();
		
		int userScore = cardValue(userCardNumber1) + cardValue(userCardNumber2);
		
		String userCardName1 = numberToName(userCardNumber1);
		String userCardName2 = numberToName(userCardNumber2);
		
		System.out.println(userCardName1);
		System.out.println(userCardName2);
		System.out.println("Your total score: " + userScore); //delete for finalization
		

		while(userScore < 21) {
			
			System.out.println("Would you like to another card? Type 'y' or 'n', then return.");
			Scanner response = new Scanner(System.in);
			String yesNo = response.next();

			if (yesNo.equals("y")){
								
				int drawnCardNumber = generateNumber();
				System.out.println("You drew " + numberToName(drawnCardNumber));
				
				userScore = userScore + cardValue(drawnCardNumber);
				
				System.out.println("Your new score: " + userScore);
				
		} else {
			System.out.println("No card for you glen coco");
		}
			
		}
		
		
	}

 	public static int generateNumber(){
 			int cardNumber = (int) (Math.random() * 52);
 			return cardNumber;
 	}
 	
 	public static int cardValue(int generatedNumber){
 		
 		generatedNumber = generatedNumber + 1;
 		int cardValue;
 		
 		if (generatedNumber % 13 == 1){
			cardValue = 1;
			// could change to 11
		} else if (generatedNumber % 13 == 11){
			cardValue = 10;
		} else if (generatedNumber % 13 == 12) {
			cardValue = 10;
		} else if (generatedNumber % 13 == 0) {
			cardValue = 10;
		} else {
			cardValue = generatedNumber - (((generatedNumber - 1)/13) * 13);
		}
 		return cardValue;
 	}
 	
 	public static String numberToName(int generatedNumber) {
 			
 			String card;
 		
 			generatedNumber = generatedNumber + 1;
			
			if (generatedNumber % 13 == 1){
				card = "Ace";
			} else if (generatedNumber % 13 == 11){
				card = "King";
			} else if (generatedNumber % 13 == 12) {
				card = "Queen";
			} else if (generatedNumber % 13 == 0) {
				card = "Jack";
			} else {
				int cardNumber = generatedNumber - ((generatedNumber - 1)/13) * 13;
				card = Integer.toString(cardNumber);
			}
			
			generatedNumber = generatedNumber - 1;
			
			if (generatedNumber / 13 == 0) {
				card = card + " of hearts";
			} else if (generatedNumber / 13 == 1) {
				card = card + " of spades";
			} else if (generatedNumber / 13 == 2) {
				card = card + " of clubs";
			} else {
				card = card + " of diamonds";
			}
			
			return card;
			
 	}
 	
}

//System.out.println("user card num 1: " + userCardNumber1);
//System.out.println("user card num 2: " + userCardNumber2);
//System.out.println("user card val 1: " + cardValue(userCardNumber1));
//System.out.println("user card val 2: " + cardValue(userCardNumber2));