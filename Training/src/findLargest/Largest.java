/**
 *  Finds the largest integer in an integer array
 */
package findLargest;
import java.util.Scanner;

public class Largest {
	
	public static void main(String[] args){
		System.out.println("input numbers, end with enter");
		Scanner input = new Scanner(System.in);
		int[] numArr;
		int counter = 0;
		
		while(input.hasNextInt()){
			counter++;
		}
		
		System.out.println(counter);
		
//		int largest = numArr[0];
//		
//		for(int i = 0; i < numArr.length - 1; i++){
//			if(numArr[i] < numArr[i + 1]) largest = numArr[i + 1]; 
//		}
//		System.out.println("the largest number is: " + largest);
		
		
	}

}

