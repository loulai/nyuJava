package hw4;
import java.util.Scanner;
public class theLargestNum {

	public static void main(String[] args) {
		
		System.out.println("input integers with space end with 0: ");
		Scanner input = new Scanner(System.in);
		
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int largest = n1;
		
		if(n2 == 0) System.out.println("too few integers, at least 2 numbers please");
		
		if(n2 > n1) largest  = n2;
		
		System.out.println("=== LARGEST INTEGER: " + largest + " ===");
		
	}

}