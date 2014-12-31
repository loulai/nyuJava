package findSecondLargest;

public class FindSecondLargestAgain {

	public static void main(String[] args) {
		int[] nums = {1,6,4,3};
		System.out.println(findSecondLargest(nums));
	}
	
	public static int findSecondLargest(int[] nums){
		int largest = nums[0];
		int secondLargest = nums[0];
		
		for(int i = 0; i < nums.length; i++){
			if(nums[i] > largest){
				secondLargest = largest;
				largest = nums[i];
			}
			if(nums[i] > secondLargest && nums[i] < largest){
				secondLargest = nums[i];
			}
		}
		return secondLargest;
	}

}
