
public class Main {

	public static void main(String[] args) {
		
		int[] list1 = new int[10];
		int[] list2 = new int[10];
		int[] list3 = new int[10];
		
		for(int i = 0; i < list1.length; i++) {
			list1[i] = (int) (Math.random() * 1501);
			list2[i] = (int) (Math.random() * 1501);
			
			list3[i] = list1[i] - list2[i];
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.println((i + 1)+ ")" + list1[i]);
			System.out.println("- " + list2[i]);
			System.out.println("= " + list3[i]);
		}
	
		
		
		
		
		
		
		
		
			
		}

	}

