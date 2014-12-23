package bubbleSort;

public class LeBubble {

	private int[] intArray;
	
	public static void main(String[] args) {
		int[] theNums = {1,2,3,4,5,6};
		
		LeBubble myBubbleIntArray = new LeBubble(theNums);
		
		System.out.println(myBubbleIntArray);
		
	}
	
	public LeBubble(int[] intArr){
		this.intArray = intArr;
	}
	
	public int[] bubbleSort(){
		int[] daIntArray = this.intArray;
		boolean flag = true;
		int temp;
		
		for(int i = 0; i < daIntArray.length - 1; i++){
			if(daIntArray[i] > daIntArray[i+1]){
				temp = daIntArray[i];
				daIntArray[i] = daIntArray[i+1];
				daIntArray[i+1] = temp;
				flag = false;
			}
		}
		return daIntArray;
	}
	
	@Override
	public String toString(){
		String s = "";
		for (int i = 0; i < this.intArray.length; i++) {
			s = s + this.intArray[i];
		}
		return s;
	}

}
