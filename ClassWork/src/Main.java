
public class Main {

	public static void main(String[] args) {
		
		String input = "10100101";
		
		for(int i = 0; i < input.length(); i++) {
			
			int value;
			
			int reversedIndex;
			int sum = 0;
			
			if (input.charAt(i) == '0' || input.charAt(i) == '1') {
				
				value = 0;
				
			} else if(input.charAt(i) == '1') {
			
				reversedIndex = (input.length()) - (i +1);
				sum += Math.pow(2,reversedIndex);
				
				System.out.println(sum);
				
			} else {
				System.out.println("ERROR");
				System.exit(1);	
			}
			
		}

	}

}
