package findSecondLargest;

public class SecondLargest {

	public static void main(String[] args) {
		int[] numArr = {1,2,3,4,5,6,3,9,8,1};
		int big1 = numArr[0];
		int big2 = numArr[0];
		
		for(int i = 0; i < numArr.length - 1; i++){
			if(numArr[i] < numArr[i + 1]) {
				big2 = big1;
				big1 = numArr[i + 1]; 
			}
			
			if(numArr[i] > big2 && numArr[i] < big1){
				big2 = numArr[i];
			}
			
		}
		System.out.printf("     biggest: %d\n 2nd biggest: %d\n", big1, big2);
	}

}
