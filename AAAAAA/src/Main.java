
public class Main {

	public static void main(String[] args) {
		int[] list = {1,2,3,4,5,6};
		
		isSorted(list);
	}

	private static boolean isSorted(int[] list) {
		boolean sorted = true;
		for (int i = 0; i < list.length -1 ; i++){
			if(list[i] > list[i+1]){
				sorted = false;
			}
		}
		return sorted;
	}

}
