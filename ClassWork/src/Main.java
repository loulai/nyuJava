
public class Main {

	public static void main(String[] args) {
		
		String input = "10101011rw0e1";
		
		for(int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '0' || input.charAt(i) == '1') {
				continue;
			} else {
				System.out.println("ERROR");
				System.exit(1);
		}

	}

}
	
}
