import java.util.Scanner;


public class ShiftByOne {

	public static void main(String[] args) {
		
		System.out.println("Please input string: ");
		Scanner input = new Scanner(System.in);
		String originalString = input.nextLine();
		
		char[] letters = originalString.toCharArray();
		int stringLength = letters.length;
		
		char purple = letters[stringLength - 1];
		char stored = letters[0];
		
		for(int i = 0; i < stringLength-1; i++){
			letters[i] = purple;
			purple = stored;
			stored = letters[i + 1];
			System.out.println("- " + i);
			System.out.println("Purple: " + purple);
			System.out.println("Stored: " + stored);
			System.out.println(new String(letters));
			System.out.println("===============");
		}
		
		String shiftedword = new String(letters);
		
		System.out.println(letters);
		
	}
		

}
