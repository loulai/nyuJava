package findLargest;

import java.util.Scanner;

public class Largest {
	
	public static void main(String[] args){
		System.out.println("input integers separated with space, and indicate end by typing 0:");
		Scanner input = new Scanner(System.in);
		
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int largest = n1;
		
		while(n2 != 0){
			System.out.println("=in while=");
			if(n1 > n2) {
				largest = n1;
				System.out.printf("n1: %d\nn2: %d\n", n1, n2);
			} else {
				largest = n2;
			}
			n1 = input.nextInt();
			n2 = input.nextInt();
				System.out.println("hello");
				System.out.printf("n1: %d\nn2: %d\n", n1, n2);
	
		}
		System.out.println("the largest number is " + largest);
	}
}

