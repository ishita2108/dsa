package dsa;

import java.util.Arrays;

public class RailwayPlatforms {
	
	public static int findMinimumPlatforms(int[] arr, int[] dep) {
		
		Arrays.sort(arr);
		Arrays.sort(dep);
		int maxPlatforms = 0;
		int neededPlatforms = 0;
		int i = 0;
		int j = 0;
		
		while(i < arr.length && j<dep.length) {
			
			if(arr[i] <= dep[j]) {
				neededPlatforms++;	
				i++;
			
			if(neededPlatforms >  maxPlatforms) {
				maxPlatforms = neededPlatforms;
			}
			}else {
				neededPlatforms--;
				j++;
			}
		}
		return maxPlatforms;
	
	}

	public static void main(String[] args) {
		int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
        
        int result = findMinimumPlatforms(arr, dep);
        System.out.println("Minimum number of platforms required: " + result);

	}

}
