package bracket;

public class BracketValidator {

	public static void main(String[] args) {
		 if(validate(args)) System.out.println("==== V A L I D ===="); //depending on if the validation returns true, prints appropriate message
		 else System.out.println("==== I N V A L I D :( ====");
	}

	/** takes a String array (with one element only), and evaluates that string to see if it the brackets input as a mathematical equation is valid or invalid
	 * @param inputStringArray command line arguments as an array which contains one element only (because we assume no spaces when inputting expression)
	 * @return boolean         true if the expression is valid, false if invalid
	 */
	private static boolean validate(String[] inputStringArray) {
		StackOfCharacters myStack = new StackOfCharacters(); //initializing an instance of the StackOfCharacters class and naming it myStack. Default capacity is 16, size is 0
		char[] inputChars = inputStringArray[0].toCharArray(); //splitting the first (and only) element of the command line String[] into characters
		for(int i = 0; i < inputChars.length; i++){ //runs #chars times
			System.out.println(i + ". " + inputChars[i] +" | Top of loop | looks like:  " + myStack);
			
			/* 
			 * The logic is that for an expression to be valid, there should be a close for every open, so
			 * myStack should end up empty if the expression is valid. If there is anything left in the myStack, it is invalid.
			 */
			
			switch (inputChars[i]){ //evaluates each character to see if its a open or closed bracket.
				case '(':           //if its a open bracket, insert itself into the myStack. 
					myStack.push('(');
					System.out.println("*** " + myStack);
					break;
	
				case ')':           
					if(myStack.empty()){ //if its a closed bracket AND the stack is empty, insert itself into the myStack. 
						myStack.push(')'); //this must be present so expressions like (2))+3 leave myStack with one character, which is the odd ')' 
						System.out.println(myStack);
					} else if (myStack.peek() == '(') { //if its a closed bracket AND the myStack isn't empty AND the top of the stack is an opening bracket
						myStack.pop(); //remove that opening bracket out of the stack
						System.out.println("We hit a close! Stack looks like: " + myStack);
					}
					break;
			}
		 }
		System.out.println(myStack);
		if (myStack.empty()) return true; //once again, a valid expression is empty because (in loose terms) all closing 
		                                  //and opening brackets should cancel each other out through 'pushing' and 'popping' the same amount of times
		else return false; //if there is anything left, it indicates there wasn't something to pop it out, so the expression is invalid
	}

}
