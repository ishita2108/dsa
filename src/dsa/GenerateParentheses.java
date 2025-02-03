package dsa;

//Question: Generate all valid parentheses for n pairs.
//
//Solution: Use recursion and backtracking to explore all combinations of ( and ).

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
	
	private static List<String> generateParentheses(int n) {
		// TODO Auto-generated method stub
		List<String> result = new ArrayList<>();
		backtrack(result, "", 0,0, n );
		return result;
	}

	private static void backtrack(List<String> result, String current, int open, int close, int n) {
		// TODO Auto-generated method stub
		 if(current.length() == n*2) {
			 result.add(current);
			 return;
		 }
		 if(open < n) {
			 backtrack(result, current + "(",open+1, close, n);
		 }
		 
		 if(close < open) {
			 backtrack(result, current+ ")",open, close+1, n);
		 }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 3; // Example for 3 pairs of parentheses
	        List<String> parentheses = generateParentheses(n);

	        // Print all the valid combinations
	        for (String combination : parentheses) {
	            System.out.println(combination);
	        }
	    }



	
}
