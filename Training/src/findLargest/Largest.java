package findLargest;

import java.util.Scanner;

public class Largest {
	
	public static void main(String[] args){
		System.out.println("input integers and press enter each time, and indicate end by typing 0:");
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int largest = n1;
		
		while(n1 != 0){
			if(n1 > n2) largest = n1;
			n1 = input.nextInt();
			if(n1 != 0) n2 = input.nextInt();
		}
		System.out.println("the largest number is " + largest);
	}
}

