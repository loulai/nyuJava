
public class Main {

	public static void main(String[] args) {
		
		int n = 2;
		
		if (n % 2 == 0) {
			System.out.println("even");
			for (int i = 0; i < 100; i++) {
				System.out.println((n/2) + ", ");
			}
				
		}
		else {
			System.out.println("odd");
		}

	}

}
