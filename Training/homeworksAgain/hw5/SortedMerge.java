package hw5;

import java.util.Scanner;

public class SortedMerge {
	
	public static void main(String[] args) {
		//getting user input. First size of the array, then the content. Same process for the second array.
		System.out.print("Size of first array: ");
		Scanner input1 = new Scanner(System.in);
		int size1 = input1.nextInt();
		double[] list1 = new double[size1];
		System.out.printf("Input %s numbers from smallest to largest, and end with enter:", size1);
		Scanner input2 = new Scanner(System.in);
		for(int i = 0; i < size1; i++){
			list1[i] = input2.nextDouble();
		}
		
		System.out.print("===\nSize of second array: ");
		Scanner input3 = new Scanner(System.in);
		int size2 = input3.nextInt();
		double[] list2 = new double[size2];
		System.out.printf("Input %s numbers from smallest to largest, and end with enter:", size2);
		Scanner input4 = new Scanner(System.in);
		for(int i = 0; i < size2; i++){
			list2[i] = input4.nextDouble();
		}
		
		double[] total = new double[size1 + size2]; //creating new array size of both entered arrays
		
		/* concept: compare elements from list1 and list2. The smaller one will be inserted into the new array, and because both lists are sorted, 
		 *          we will end up with a sorted array.
		 * how: each array has a counter, and that dictates which value is being compared. Towards the end, when one array has been completely
		 *      'inserted' into the final array, the remaining values of the other array are inserted in (naturally, it is sorted).
		 *       e.g. [1,2,4] and [3,5,6]. list1 will reach the 'end' when 4 is copied into final array. The if statement goes into the if else
		 *       section, and the remaining values in list2 (5 and 6) are inserted into final array.
		 */
		int c1 = 0; //initializing counters
		int c2 = 0;
		
		for(int i = 0; i < total.length; i++){
			
			if(c1 < size1 && c2 < size2){
				
				if(list1[c1] < list2[c2]){
					total[i] = list1[c1];
					c1++; //increment each time one value of the array has been inserted. Same below for list2.
				}else if (list1[c1] > list2[c2]){
					total[i] = list2[c2];
					c2++;
				}else if(list1[c1] == list2[c2]){ //for when there are two equal numbers
					total[i] = list1[c1]; //in this situation, list1 is chosen to be inserted in first. The next iteration slots in the same value (naturally) but 
					                      // from list2 instead. It doesn't matter if it was list1 or list2 first, as long as the list counter increment corresponds.
					c1++; 
				} 
			/*when the 'end' of a list is reached*/
			} else if(c1 >= size1){ //list1 has been 'used up'
				total[i] = list2[c2]; //fill the remaining spaces in final array with remaining values from list2
				c2++;
			} else if (c2 >= size2){ //list2 used up this time, so fill with leftover list1 values
				total[i] = list1[c1];
				c1++;
			}
			
		}
		
		System.out.printf("======== New Array (%d): ===============\n", total.length);
		for(int i = 0; i < total.length; i++){
			System.out.printf("[%3.1f] ",total[i]);
		}
		
	}
	
}
