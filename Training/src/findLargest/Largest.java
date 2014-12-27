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
			if(n1 > n2) {
				largest = n1;
			} else {
				largest = n2;
			}
			n1 = input.nextInt();
			n2 = input.nextInt();
		}
		
		if(n2 == 0 ){
			if(n1 > largest) largest = n1;
		}
		
		System.out.println("the largest number is " + largest);
	}
}

