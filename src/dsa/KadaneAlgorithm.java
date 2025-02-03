package dsa;

public class KadaneAlgorithm {
	
	private static int maxSubArray(int[] nums) {
		// TODO Auto-generated method stub
		int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        
        for(int i =0; i< nums.length; i++) {
        	
        	currentSum = Math.max(nums[i], currentSum + nums[i]);
        	maxSum = Math.max(maxSum, currentSum);
        }
		return maxSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; // Example array
	        int maxSum = maxSubArray(nums);
	        System.out.println("Maximum Sum of a Contiguous Subarray: " + maxSum);
	    }


}
