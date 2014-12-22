package sortingAlphabetically;

public class GiftSorter {

	public static void main(String[] args) {
		System.out.println("a".compareTo("b"));
		System.out.println(sortGiftCode("sdbca"));

	}
	
	public static String sortGiftCode(String unsorted){
		boolean flag = true;
		String sorted = "";
		
		while(flag){
			for(int i = 0; i < unsorted.length() - 1; i++){
				String letter1 = Character.toString(unsorted.charAt(i));
				String letter2 = Character.toString(unsorted.charAt(i+1));
				if(letter1.compareToIgnoreCase(letter2) > 0){
					sorted = sorted + letter2 + letter1;
					System.out.println("in first if " + i + sorted);
					flag = false;
				} else {
					sorted = sorted + letter1 + letter2;
					System.out.println("IN ELSE " + i + sorted);
					flag = false;
				}
			}
		}
		
		return sorted;
	}

}
