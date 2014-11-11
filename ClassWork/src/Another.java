
public class Another {
	
	public static void main(String[] args){
		int[] myArr = {-7, 3, 99, -10, 0, 0, 43, 10, 20};
		System.out.println(lengthOfSortedSequence(myArr));
	}
	
	public static int lengthOfSortedSequence(int[] someArr){
		int lengthMax =0;
		int temp;
		
		if (someArr.length != 0){
			temp = 1;
		} else {
			return 0;
		}
		
		for (int i=0; i< someArr.length - 1; i++ ){
			if (someArr[i] <= someArr[i+1]){
				temp = temp + 1;
			} else if(temp > lengthMax){
				lengthMax = lengthMax + temp;
				temp = 1;
				
			} else {
				temp =1;
			}
			if(temp > lengthMax){
				return temp;
			} else {
				return lengthMax;
			}
		}
		return temp;
	}
}

