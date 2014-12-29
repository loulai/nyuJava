package hw5;

public class SortedMerge {
	
	public static void main(String[] args) {
		double[] list1 = {1,2,4,6};
		double[] list2 = {2,3,5,7};
		double[] total = new double[list1.length + list2.length];
		
		for(int i = 0; i < list1.length; i++){
			if(list1[i] < list2[i]){
				total[i] = list1[i];
			} else if (list1[i] > list2[i]){
				total[i] = list2[i];
			}
		}
		
		for(int i = 0; i < total.length; i++){
			System.out.print(total[i] + " ");
		}
		
	}
	
}
