import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		
		String[] names = {"Lou", "Jack", "Kala", "Lou"};
		
		String key = "Lou";
		
		System.out.println("Number of times shows up: " + findCount(names, key));
	
	}

	private static int findCount(String[] names, String person) {
		int counter = 0; //initial counter variable
		
		for (int i = 0; i < names.length; i ++) {
			if(names[i].equalsIgnoreCase(person)) {
				counter ++;
			}
		}
		return counter;
	}
	
}
