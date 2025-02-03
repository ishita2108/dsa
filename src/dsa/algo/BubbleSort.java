package dsa.algo;

public class BubbleSort {
	
	public static void main (String args[]) {
		int[] array = {5, 1, 4, 2, 8};
        bubbleSort(array);
        
        System.out.println("Sorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
		
		
	}
	
	public static void bubbleSort(int[] arr) {
		
		for (int i=0; i< arr.length-1; i++) {
			for(int j=0;j<arr.length-i-1; j++) {
				if(arr[j]> arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
		}
	}

}
