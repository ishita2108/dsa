package dsa.algo;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {5, 1, 4, 2, 8};
		int low = 0;
		int high =  array.length-1;
        quickSort(array, low, high);
        
        System.out.println("Sorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

	}

	private static void quickSort(int[] array, int low, int high) {
		// TODO Auto-generated method stub
		if(low < high) {
			
			int pivot = partition(array, low,high);
			quickSort(array, low, pivot-1);
			quickSort(array, pivot+1, high);
		}
		
	}

	private static int partition(int[] array, int low, int high) {
		// TODO Auto-generated method stub
		int pivot = array[high];
		int i = low-1;
		
		for(int j =low; j<=high; j++) {
			if(array[j] < pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		int temp = array[i+1];
		array[i+1] = array[high];
		array[high] = temp;
		return i+1;
	}



}
