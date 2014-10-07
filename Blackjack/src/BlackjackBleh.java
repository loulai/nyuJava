import java.util.Scanner;

/*
 * Created on : September 23rd 2014
 * Description: 
 * @author Lou Lai
 */

public class BlackjackBleh {

	
	public static void main(String[] args) {
		
		// USER generating random num, then getting score
		int userCardNumber1 = generateNumber();
		int userCardNumber2 = generateNumber();
		int userScore = cardNumberToScore(userCardNumber1) + cardNumberToScore(userCardNumber2);
	
		// USER creating and printing drawn card
		String userCardName1 = numberToName(userCardNumber1);
		String userCardName2 = numberToName(userCardNumber2);
		System.out.println(userCardName1);
		System.out.println(userCardName2);
		
		// DEALER generating num, totalling score
		int dealerCardNumber1 = generateNumber();
		int dealerCardNumber2 = generateNumber();
		int dealerScore = cardNumberToScore(dealerCardNumber1) + cardNumberToScore(dealerCardNumber1);
		
		// DEALER creating and printing drawn card
		String dealerCardName1 = numberToName(dealerCardNumber1);
		String dealerCardName2 = numberToName(dealerCardNumber2);
		
		//rare condition where someone wins straight up
		if(userScore == 21) {
			System.out.println("How lucky, you straight up won!");
		} else if (dealerScore == 21) {
			System.out.println("Dealer hit 21. Sorry, you lost!");
		} 

		//while the user has a score less than 21 do the code
		
		
		
		while(userScore < 21 && dealerScore < 21) {
			
			//prompting if want to draw a card or not, and getting a response for yesNo
			System.out.println("--- Want another card? Type 'y' or 'n', then hit return. ---");
			Scanner response = new Scanner(System.in);
			String yesOrNo = response.next();

			//if response is yes do code
			if (yesOrNo.equals("y")){
								
				//creating random card, and displaying
				int newCardNumber = generateNumber();
				System.out.println("You drew " + numberToName(newCardNumber));
				
				//tallying up score, and displaying
				userScore = userScore + cardNumberToScore(newCardNumber);
				System.out.println("Your new score: " + userScore);
				
				//if user at this point gets 21, the user win
				// or they get bust. Both break loop and get displays message.
				if (userScore == 21) {
					System.out.println("You Won!");
					break;
				} else if(userScore > 21){
					System.out.println("You bust! Game over.");
					break;
				} 
				
			// if user says no, it's the dealer's turn
			} else {
				System.out.println("No card for you. Dealers turn.");
				break;
				}
				
			}
		
		
		while(dealerScore < 21 && userScore < 21) {
			int dealerNewCardNumber1 = generateNumber();
			dealerScore = dealerScore + cardNumberToScore(dealerNewCardNumber1);
			
			// DEALER creating and printing drawn card (and total score but will b deleted)
			String dealerNewCardName1 = numberToName(dealerNewCardNumber1);
			System.out.println("Dealer draws: " + dealerNewCardName1);
			
			System.out.println("Dealer's new total: " + dealerScore);//deleteeeeee
			
			if (dealerScore == 21){
				System.out.println("Dealer hits 21 and wins!");
			} else if(dealerScore < 21){
				int dealerNewCardNumber2 = generateNumber();
				dealerScore = dealerScore + cardNumberToScore(dealerNewCardNumber2);
				String dealerNewCardName2 = numberToName(dealerNewCardNumber2);
				System.out.println("Dealer draws: " + dealerNewCardName2);
				System.out.println("Dealer's new total: " + dealerScore);//deleteeee
				
				if (dealerScore > 21) {
					System.out.println("Dealer drew two cards and bust. You win!");
				} else if (dealerScore == 21) {
					System.out.println("Dealer drew two cards and hit 21. Dealer wins!");
				}
				
			} else if (dealerScore > 21) { //dont need elseif, but just for clarity's sake
				System.out.println("Dealer drew one card and bust. You win!");
			}
			break;
		}
	}
	
	
	
	
	
	
	

 	public static int generateNumber(){
 			int cardNumber = (int) (Math.random() * 52);
 			return cardNumber;
 	}
 	
 	public static int cardNumberToScore(int generatedNumber){
 		
 		generatedNumber = generatedNumber + 1;
 		int cardScore;
 		
 		if (generatedNumber % 13 == 1){
			cardScore = 1;
		} else if (generatedNumber % 13 == 11){
			cardScore = 10;
		} else if (generatedNumber % 13 == 12) {
			cardScore = 10;
		} else if (generatedNumber % 13 == 0) {
			cardScore = 10;
		} else {
			cardScore = generatedNumber - (((generatedNumber - 1)/13) * 13);
		}
 		return cardScore;
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
//System.out.println("user card num 2: " + userCardNumber2);
//System.out.println("user card val 1: " + cardValue(userCardNumber1));
//System.out.println("user card val 2: " + cardValue(userCardNumber2));