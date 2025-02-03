package dsa;
public class CountSetBits {

    // Function to count the number of 1-bits in an integer
    public static int countOneBits(int n) {
        int count = 0;
        
        // Loop until all bits are processed
        while (n != 0) {
            // Check if the least significant bit is 1
            if ((n & 1) == 1) {
                count++; // Increment count if the bit is 1
            }
            n = n >> 1; // Right shift the number to process the next bit
        }
        
        return count;
    }

    public static void main(String[] args) {
        int number = 29; // Example number: Binary representation of 29 is 11101
        
        int setBits = countOneBits(number);
        
        System.out.println("The number of 1-bits in " + number + " is: " + setBits);
    }
}
