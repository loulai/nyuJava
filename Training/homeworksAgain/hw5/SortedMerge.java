package hw5;

import java.util.Scanner;

public class SortedMerge {
	
	public static void main(String[] args) {
		System.out.print("size of first array: ");
		Scanner input1 = new Scanner(System.in);
		int size1 = input1.nextInt();
		int[] arr1 = new int[size1];
		
		System.out.print("size of second array: ");
		Scanner input2 = new Scanner(System.in);
		int size2 = input2.nextInt();
		
		double[] list1 = {1,3,5,7};
		double[] list2 = {2,4,6,8};
		double[] total = new double[list1.length + list2.length];
		int c2 = 0;
		int c1 = 0;
		
		for(int i = 0; i < total.length - 1; i++){
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
		
		for(int k = 0; k < total.length; k++){
			System.out.print(total[k] + " ");
		}
		
	}
	
}
