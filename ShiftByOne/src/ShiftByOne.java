import java.util.Scanner;


public class ShiftByOne {

	public static void main(String[] args) {
		
		System.out.println("Please input string: ");
		Scanner input = new Scanner(System.in);
		String originalString = input.nextLine();
		
		char[] letters = originalString.toCharArray();
		int stringLength = letters.length;
		char firstChar = letters[0];
		char lastChar = letters[(stringLength - 1)];
		
	  	letters[0] = lastChar;
	  	char storedChar1 = letters[1];

	  	letters[1] = firstChar;
	  	char storedChar2 = letters[2];
	  	
	  	}
		
		for (int i = 0; i < stringLength; i++) {
			
			  		letters[i] = storedChar1;
		
		}
		
		String shiftedword = new String(letters);
		
		System.out.println(letters);
		
	}
		

}
