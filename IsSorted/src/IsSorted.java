import java.util.Scanner;

public class IsSorted {

	public static void main(String[] args) {
		
		System.out.println("Type nums: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		boolean isSorted = true;
		
			for(int i = 0; i < 10; i++) {
				System.out.println("old num " + num);
				int newNum = input.nextInt();				
				num = input.nextInt();
				System.out.println("compare " + newNum);
				System.out.println("new num " + num);
			}
			
	}
	
}
