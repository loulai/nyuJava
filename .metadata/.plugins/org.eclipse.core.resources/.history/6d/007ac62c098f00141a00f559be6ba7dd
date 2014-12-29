package hw5;
import java.util.Scanner;
public class ShiftByOneRefactored2 {
	public static void main(String[] args){
		System.out.print("type input string: ");
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		char[] letters = s.toCharArray();
		char storer = 'c'; //doesn't matter what this is
		char swapper = letters[letters.length-1];
		
		// c r a b s
		for(int i = 0; i < letters.length; i++){
			storer = letters[i];
			letters[i] = swapper;
			swapper = storer;
		}
		
		System.out.printf("Original : %s\n", s);
		System.out.printf("Shifted  : %s", new String(letters));
		
		
	}
}
