package bubbleSort;

public class LeBubble {
	public static void main(String[] args){
		int[] nums = {1,2,3,3,2};
		bubbleSort(nums);
		for(int i = 0; i < nums.length; i++){
			System.out.println(nums[i]);
		}
	}
	
	public static int[] bubbleSort(int[] nums){
		int[] sorted = new int[nums.length];
		boolean flag  = true;
		int temp;
		
		while(flag){
			flag = false;
			for(int i = 0; i < nums.length - 1; i++){
				if(nums[i] > nums[i + 1]){
					temp = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = temp;
					flag = true;
				}
			}
		}
		return sorted;
	}
}