package dsa.algo;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {5, 1, 4, 2, 8};
        selectionSort(array);
        
        System.out.println("Sorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
	}

	private static void selectionSort(int[] array) {
		// TODO Auto-generated method stub
		for (int i =0; i <array.length; i++) {
		int minIndex = i;
		for (int j =i+1; j<array.length; j++) {
		if(array[minIndex] > array[j]) {
			minIndex = j;
		}
		}
		 int temp = array[minIndex];
		 array[minIndex] = array[i];
		 array[i] = temp;
		}
		
	}

}
