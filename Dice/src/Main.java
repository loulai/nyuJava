
public class Main {

	public static void main(String[] args) {
		
		int oneCounter = 0;
		int twoCounter = 0;
		int threeCounter = 0;
		int fourCounter = 0;
		int fiveCounter = 0;
		int sixCounter = 0;
		
		for (int i = 0; i < 10000; i++) {
			
			Double myDouble = Math.random() * 6;
			
			int myInt = myDouble.intValue();
			
			if (myInt == 0) {
				oneCounter++;
			} else if (myInt == 1) {
				twoCounter++;
			} else if (myInt == 2) {
				threeCounter++;
			} else if (myInt == 3) {
				fourCounter++;
			} else if (myInt == 4) {
				fiveCounter++;
			} else {
				sixCounter++;
			}
		}
		
		System.out.println("One Counter has: " + oneCounter);	
		System.out.println("Two Counter has: " + twoCounter);
		System.out.println("Three Counter has: " + threeCounter);
		System.out.println("One Counter has: " + fourCounter);	
		System.out.println("Two Counter has: " + fiveCounter);
		System.out.println("Three Counter has: " + sixCounter);
		
	}

}
