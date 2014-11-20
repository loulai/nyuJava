package bracket;

public class BracketValidator {

	public static void main(String[] args) {
		
		 System.out.println(validate(args));
	}

	private static boolean validate(String[] inputStringArray) {
		StackOfCharacters myStack = new StackOfCharacters();
		char[] inputChars = inputStringArray[0].toCharArray();
		for(int i = 0; i < inputChars.length; i++){
			switch (inputChars[i]){
				case '(': 
					myStack.push('(');
					System.out.println("1." + myStack);
	
				case ')': 
					if(myStack.empty()){
						System.out.println("invalid! empty stack");
					} else if (myStack.peek() == ')') {
						System.out.println("2." + myStack);
						myStack.pop();
					}
					break;
			}
		 }
		System.out.println(myStack);
		if (myStack.empty()) return true;
		else return false;
	}

}
