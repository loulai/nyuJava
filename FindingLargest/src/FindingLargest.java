import java.util.Scanner;


public class FindingLargest {

	public static void main(String[] args) {
		System.out.print("Type number: ");
		Scanner input = new Scanner(System.in);
		int max = input.nextInt();
		int occurance = 0;
		
		max = findMaximum(input, max);

		System.out.println("gello");
		
//		while(max != 0) {
//			if(max == input.nextInt()) {
//				occurance = occurance + 1;
//			}
//		System.out.println(occurance);
//		}
	
	}

	private static int findMaximum(Scanner input, int max) {
		while(max != 0) {
			int newNum = input.nextInt();
			System.out.println("Looking at     :  " + max);
			System.out.println("Then looking at:  " + newNum);
			if(newNum > max) {
				max = newNum;
			}	
		System.out.println("Biggest        :  " + max);
		}
		return max;
	}

}
