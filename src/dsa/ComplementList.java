package dsa;

//Question: Given an array of integers, find two numbers such that they add up to a specific target number.
//Solution: Use a hash map to track the complement of the current element.

import java.util.HashMap;
import java.util.Map;

public class ComplementList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] nums = {2, 7, 11, 15, 5,6,3};
	        int target = 9;
	        Map<Integer,Integer> result = findTwoSum(nums, target);
	        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }

	}

	private static Map<Integer, Integer> findTwoSum(int[] nums, int target) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> map = new HashMap<>();
		for(int i =0; i < nums.length; i++) {
			int complement = target - nums[i];
			if(map.containsKey(complement)) {
				map.put(nums[i], complement);
			}else {
                // Otherwise, store the current number for future complement lookups
                map.put(nums[i], null);
            }
        }
        // Remove entries that have no valid complement
        map.entrySet().removeIf(entry -> entry.getValue() == null);
		return map;
	}
	
//	List<Integer> q = new ArrayList();
//	 Integer[] nums = {2, 7, 11, 15, 5,6,3};
//	 Integer[] numsd = (Integer[]) q.toArray();
//	 List<Integer> qe = Arrays.asList(nums);

}
