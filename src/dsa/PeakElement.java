package dsa;

//Question: Find the peak element in an array (an element that is greater than its neighbors).
//
//Solution: Use a binary search approach to find the peak in O(log n) time.

public class PeakElement {
	
	private static int findPeakElement(int[] nums) {
		// TODO Auto-generated method stub
		int low = 0;
		int high = nums.length-1;
		
		while(low < high) {
		int mid = low + (high-low)/2;
		if(nums[mid]< nums[mid +1]) {
			low = mid +1;
		}else {
			high = mid;
		}
		}
	
		return low;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 2, 3, 1}; // Example array
        int peakIndex = findPeakElement(nums);
        System.out.println("Peak element index: " + peakIndex);
        System.out.println("Peak element value: " + nums[peakIndex]);

	}

}
