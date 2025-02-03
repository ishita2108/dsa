package dsa;

//Question: Reverse a string without affecting special characters.
//Solution: Use two pointers, one at the beginning and one at the end, and swap characters unless they are special characters.

public class SwapIfNotSpecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input = "a,b$c";
	        System.out.println("Original String: " + input);
	        System.out.println("Reversed String: " + reverseWithoutAffectingSpecialChars(input));

	}

	private static String reverseWithoutAffectingSpecialChars(String input) {
		char[] chrArray = input.toCharArray();
		// TODO Auto-generated method stub
		int start = 0;
		int end = input.length() -1;
		
		if(!Character.isLetterOrDigit(chrArray[start])) {
			start++;
		}
		
		else if(!Character.isLetterOrDigit(chrArray[end])) {
			end--;
		}
		else {
			char temp = chrArray[start];
			chrArray[start] = chrArray[end];
			chrArray[end] = temp;
			start++;
			end--;
			
		}
		return new String(chrArray);
	}

}
