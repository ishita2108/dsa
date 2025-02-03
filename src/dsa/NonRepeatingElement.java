package dsa;

//Question: Find the only non-repeating element in an array where every other element repeats twice.
//Solution: Use XOR to cancel out repeating elements.
public class NonRepeatingElement {
	
	private static int findNonRepeatingElement(int[] arr) {
		// TODO Auto-generated method stub
		int res = 0;
		
		for(int num:arr) {
			res = res ^=num;
		}
		return res;
	}

	public static void main(String[] args) {

        int[] arr = {2, 3, 5, 4, 5, 3, 4, 2}; // Example array where 2 is the non-repeating element
        
        int nonRepeatingElement = findNonRepeatingElement(arr);
        
        System.out.println("The non-repeating element is: " + nonRepeatingElement);


	}

}
