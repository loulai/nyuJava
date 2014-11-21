package bracket;

public class BracketValidator {

	public static void main(String[] args) {
		 if(validate(args)) System.out.println("==== V A L I D ====");
		 else System.out.println("==== I N V A L I D :( ====");
	}

	private static boolean validate(String[] inputStringArray) {
		StackOfCharacters myStack = new StackOfCharacters();
		char[] inputChars = inputStringArray[0].toCharArray();
		for(int i = 0; i < inputChars.length; i++){
			System.out.println(i + ". " + inputChars[i] +" | Top of loop | looks like:  " + myStack);
			switch (inputChars[i]){
				case '(': 
					myStack.push('(');
					System.out.println("*** " + myStack);
					break;
	
				case ')': 
					if(myStack.empty()){
						myStack.push(')');
						System.out.println(myStack);
					} else if (myStack.peek() == '(') {
						myStack.pop();
						System.out.println("We hit a close! Stack looks like: " + myStack);
					}
					break;
			}
		 }
		System.out.println(myStack);
		if (myStack.empty()) return true;
		else return false;
	}

}
