import java.util.Scanner;


public class FindingLargest {

	public static void main(String[] args) {
		System.out.print("Type number: ");
		Scanner input = new Scanner(System.in);
		int max = input.nextInt();
		int num = 2;
	
		while (num != 0) {
			num = input.nextInt();
			if (num > max && num != 0){
				max = num;
			}
		}
		
		System.out.println(max);
		
	}

}
