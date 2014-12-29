package hw5;
import java.util.Scanner;
public class ShiftByX {

	public static void main(String[] args) {
		
		System.out.print("Input string you would like to shift: ");
		Scanner input1 = new Scanner(System.in);
		String s = input1.nextLine();
		System.out.print("Shift by how many characters? ");
		Scanner input2 = new Scanner(System.in);
		int shiftInt = input2.nextInt();
		
		char[] letters = s.toCharArray();
		char storer;
		
		for(int k = 0; k < shiftInt; k++){
			char swapper = letters[letters.length - 1]; //this needs to be reset everytime, because the last storer/swapper situation is a little messy
			for(int i = 0; i < letters.length; i++){
				storer = letters[i];
				letters[i] = swapper;
				swapper = storer;
				if(i == (letters.length - 1)){
					System.out.printf("STORER[%s] SWAPPER[%s]\n", storer, swapper);
				}
			}	
		}
		System.out.printf("=== original : %s ===\n", s);
		System.out.printf("=== shifted  : %s ===", new String(letters));
	}

}
