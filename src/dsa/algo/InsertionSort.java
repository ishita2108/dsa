package dsa.algo;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5, 1, 4, 2, 8};
        insertionSort(array);
        
        System.out.println("Sorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

	}

	private static void insertionSort(int[] array) {
		// TODO Auto-generated method stub
		int n = array.length;
		for(int i=1; i<n; i++) {
			int key = array[i];
			int j = i-1;
			while (j>=0 && array[j] > key) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = key;
		}
		
	}

}
