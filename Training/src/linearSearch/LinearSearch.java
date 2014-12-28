package linearSearch;

public class LinearSearch {

	public static void main(String[] args) {
		
		String key = "hello";
		String[] w1 = {"yo", "homeless", "man", "hello"};
		String[] w2 = {"yo", "homeless", "man", "buhbye"};

		System.out.println(LinearSearch.includes(w2, key));
	}
	
	public static boolean includes(String[] arr, String key){
		boolean contains = false;
		for(int i = 0; i < arr.length; i++){
			if(arr[i].equalsIgnoreCase(key)) contains = true;
		}
		return contains;
	}
}