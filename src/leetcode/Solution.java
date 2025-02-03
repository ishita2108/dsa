package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class Solution {
	
	
	public static void main (String args[]) {
		int[] in = new int[] {2,7,11,15};
		System.out.println(twoSum(in, 9));
		
		String input = " ";
		char[] c = input.toCharArray();
		for(int i =0; i< c.length; i++) {
		System.out.println("C array " + c[0]);
		}
		
		Stack<Character> stack = new Stack();
		stack.push(' ');
		System.out.println("Stack Size " + stack.size());
	
	}
    public static int[] twoSum(int[] nums, int target) {

    	int[] output = new int[2];
    	 List l = Arrays.asList(nums);

        for(int i=0; i< nums.length; i++){
           
            //boolean contains = IntStream.of(nums).anyMatch(x -> x == num);
            //List<int[]> l = Arrays.asList(nums);
            System.out.println(l);
            int num = target - nums[i];
            System.out.println("num" + num);
            if(l.contains(num)){
                output[0] = i;
                System.out.println("i" + i);
                output[1] = l.indexOf(num);
                System.out.println("I+1" + l.indexOf(num));
            }
        }
    return output;
        
    }
}