import java.util.Scanner;


public class ReverseString {

	public static void main(String[] args) {
		
		System.out.println("Enter a string: ");
		Scanner input = new Scanner(System.in);
		String myS = input.nextLine();
	
		System.out.println("Your string in reverse is: " + reverse(myS));
	}
	
	public static String reverse(String textToReverse) {
		char[] charArray =  textToReverse.toCharArray();
		int i = 0;
		int j = textToReverse.length() - 1;
		
		while (i < j) {
			char temp = charArray[i];
			charArray[i]= charArray[j]; 
			charArray[j] = temp;
			i++;
			j--;
		}
		return new String(charArray);
	}

}
