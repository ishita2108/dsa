package dsa.algo;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {5, 1, 4, 2, 8};
		int left = 0;
		int right =  array.length-1;
        mergeSort(array, left, right);
        
        System.out.println("Sorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
	}

	private static void mergeSort(int[] array, int left, int right) {
		// TODO Auto-generated method stub
		if(left<right) {
		int mid = (left+right)/2;
		mergeSort(array, left, mid);
		mergeSort(array,mid+1,right);
		merge(array,left,mid,right);
		}
		
	}

	private static void merge(int[] array, int left, int mid, int right) {
		// TODO Auto-generated method stub
		int n1 = mid-left+1;
		int n2 = right-mid;
		
		int lArray[] = new int[n1];
		int rArray[] = new int[n2];
		
		for(int x =0; x<n1; x++) {
			lArray[x] = array[left+x];
		}
		
		for(int x =0; x<n2; x++) {
			rArray[x] = array[mid+1+x];
		}
		
		int i =0;
		int j = 0;
		int k = left;
		
		while(i <n1 && j <n2) {
			
			if(lArray[i] <= rArray[j]) {
				array[k] = lArray[i];
				i++;
				
			}else {
				array[k] = rArray[j];
				j++;
			}
			k++;
			
		}
		while( i < n1) {
			array[k] = lArray[i];
			i++;
			k++;
		}
		while( j < n2) {
			array[k] = rArray[j];
			j++;
			k++;
		}
	}

}
