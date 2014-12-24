package bubbleSort;

public class LeBubble {

	private int[] intArray;
	
	public static void main(String[] args) {
		int[] theNums = {1,2,3,4,5,6,9,1,7};
		
		LeBubble myBubbleIntArray = new LeBubble(theNums);
		myBubbleIntArray.bubbleSort();

		for(int i = 0; i < myBubbleIntArray.intArray.length; i++){
			System.out.print(myBubbleIntArray.intArray[i] + " ");
		}
		
	}
	
	public LeBubble(int[] intArr){
		this.intArray = intArr;
	}
	
	public int[] bubbleSort(){
		int[] daIntArray = this.intArray;
		boolean flag = true;
		int temp;
		
		while(flag){
			for(int i = 0; i < daIntArray.length - 1; i++){
				if(daIntArray[i] > daIntArray[i+1]){
					temp = daIntArray[i];
					daIntArray[i] = daIntArray[i+1];
					daIntArray[i+1] = temp;
					flag = false;
					System.out.println(i + " hi");
				}
			}
		}
		return daIntArray;
	}
	
	
}