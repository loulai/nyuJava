package hw5;

public class SortedMerge {
	
	public static void main(String[] args) {
		double[] list1 = {1,3,5,7};
		double[] list2 = {2,4,6,8};
		double[] total = new double[list1.length + list2.length];
		int c2 = 0;
		int c1 = 0;
		
		for(int i = 0; i < list1.length; i++){
			if(list1[c1] < list2[c2]){
				total[i] = list1[c1];
				c1++;
			}else if (list1[c1] > list2[c2]){
				total[i] = list2[c2];
				c2++;
			}else if(list1[c1] == list2[c2]){
				total[i] = list1[c1];
				c1++;
			}
		}
		
		for(int i = 0; i < total.length; i++){
			System.out.print(total[i] + " ");
		}
		
	}
	
}
