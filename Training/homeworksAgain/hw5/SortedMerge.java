package hw5;

import java.util.Scanner;

public class SortedMerge {
	
	public static void main(String[] args) {
		System.out.print("Size of first array: ");
		Scanner input1 = new Scanner(System.in);
		int size1 = input1.nextInt();
		double[] arr1 = new double[size1];
		System.out.printf("Input %s numbers from smallest to largest, and end with enter:", size1);
		Scanner input2 = new Scanner(System.in);
		for(int i = 0; i < size1; i++){
			arr1[i] = input2.nextDouble();
		}
		
		System.out.print("Size of second array: ");
		Scanner input3 = new Scanner(System.in);
		int size2 = input3.nextInt();
		double[] arr2 = new double[size2];
		System.out.printf("Input %s numbers from smallest to largest, and end with enter:", size2);
		Scanner input4 = new Scanner(System.in);
		for(int i = 0; i < size2; i++){
			arr2[i] = input4.nextDouble();
		}
		
//		double[] total = new double[list1.length + list2.length];
//		int c2 = 0;
//		int c1 = 0;
//		
//		for(int i = 0; i < total.length - 1; i++){
//			if(list1[c1] < list2[c2]){
//				total[i] = list1[c1];
//				c1++;
//			}else if (list1[c1] > list2[c2]){
//				total[i] = list2[c2];
//				c2++;
//			}else if(list1[c1] == list2[c2]){
//				total[i] = list1[c1];
//				c1++;
//			}
//		}
//		
//		for(int k = 0; k < total.length; k++){
//			System.out.print(total[k] + " ");
//		}
		
	}
	
}
