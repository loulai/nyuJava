
public class Test {

	public static void main(String[] args) {
		int val = 4;
		int[] arr = {1,3,4,5,4};
		for (int i =0; i < arr.length; i++){
			if(arr[i] == val){
				arr[i] = val;
			}
			
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]);
		}
		
	}
	}
}
