
public class Main {

	public static void main(String[] args) {
		
		int oneCounter = 0;
		
		for (int i = 0; i < 6; i++){
			Double randDouble = Math.random() * 6 + 1;	
		
			System.out.printf(i + 1 + ". The random number is %f \n", randDouble);
			
			int tempRandNumber = randDouble.intValue();
			
			Double randDoubleTwo = Math.round(randDouble);
			
			System.out.println(tempRandNumber);
			
			if (tempRandNumber == 1) {
				oneCounter++;
			}
			
		}
		
	}

}
