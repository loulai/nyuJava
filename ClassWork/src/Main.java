import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		
		int number = 0;

		int[] numArr = new int[1];
		numArr[0]=0;
		
		m(number, numArr);
		
		System.out.println("number: " + number);
		System.out.println("number array: " + numArr[0]);
		
		int count = 0;
		do{
			System.out.println(count + " hello");
		} while (count++ < 9);
		
			System.out.println(count);
			
	}
	
	public static void m(int someNumber, int[] someArray) {
		someNumber = 3;
		someArray[0] = 3;
	}
	
}

