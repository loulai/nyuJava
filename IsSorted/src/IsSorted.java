import java.util.Scanner;

public class IsSorted {

	public static void main(String[] args) {

		System.out.println("Type 10 numbers (must be 10 numbers): ");
		Scanner input = new Scanner(System.in);
		boolean isSorted = true;
		int[] numArray = new int[10];

		populateArray(input, numArray);

		for(int i = 0; i < 9; i++){
			if(numArray[i] > numArray[i+1]){
				isSorted = false;
			} 
		}
		
		if(isSorted) {
			System.out.println("===Hurrah! It's sorted!===");
		} else {
			System.out.println("===Poo... it's not sorted===");
		}

	}

	private static int[] populateArray(Scanner input, int[] numArray) {
		for(int i = 0; i < 10; i++){
			numArray[i] = input.nextInt();
			System.out.println(numArray[i]);
		}
		return numArray;
	}


}