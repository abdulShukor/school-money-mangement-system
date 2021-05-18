package ArrayExamples;

public class MaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] a= {1,2,9,-4,-5,-6,-7,9,8,-8,9};
		
		int store = maxSubArray(a);
		System.out.print(store);
	}
	
	public static int maxSubArray(int[] nums) {
	    int result = nums[0];
	    int sum = nums[0];
	 
	    for(int i=1; i<nums.length; i++){
	        sum = Math.max(nums[i], sum + nums[i]);
	        result = Math.max(result, sum);
	    }
	 
	    return result;
	}

}
