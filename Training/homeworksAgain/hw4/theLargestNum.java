package hw4;
import java.util.Scanner;
public class theLargestNum {

	public static void main(String[] args) {
		
		System.out.println("input integers with space end with 0: ");
		Scanner input = new Scanner(System.in);
		
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int largest = n2;
		int secondLargest = n1;
		
		if(n2 == 0) System.out.println("too few integers, at least 2 numbers please");
		if(n1 > n2) {
			secondLargest = largest;
			largest = n1;
		}
		
		while(n1 != 0){ //compare nextInt() with the last largest integer from last movement
			n1 = input.nextInt();
			if(n1 > largest) {
				secondLargest = largest;
				largest = n1;
			}
			if(n1 < largest && n1 > secondLargest) secondLargest = n1;
		}
		
		System.out.println("===     LARGEST INTEGER: " + largest + " ===");
		System.out.println("=== 2ND LARGEST INTEGER: " + secondLargest + " ===");
	
		
	}

}
