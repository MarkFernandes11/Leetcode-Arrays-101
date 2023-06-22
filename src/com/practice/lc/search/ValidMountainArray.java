package com.practice.lc.search;

public class ValidMountainArray {

	public static void main(String[] args) {
		int[] nums = { 0,3,2,1 };
//		int[] nums = { 0,1,2,3,4,5,6,7,8,9 };
		
		System.out.println(validMountainArray(nums));
	}
	
	// My approach
    public static boolean validMountainArray1(int[] arr) {
    	if(arr.length < 3) return false;
    	
    	int prev = arr[0];
    	boolean reachedMax = false;
    	
    	for (int i = 1; i < arr.length; i++) {
			if(i == 1 && arr[i] < prev) return false;
			
			if(arr[i] > prev) {
				if(!reachedMax) {
					prev = arr[i];
				} else {
					return false;
				}
			} else if(arr[i] < prev) {
				reachedMax = true;
				prev = arr[i];
			} else {
				return false;
			}
			
		}
    	
    	return reachedMax;
    }
    
    
    public static boolean validMountainArray(int[] arr) {
    	int i = 0, n = arr.length, j = n - 1;
    	
//    	For upward climb from L2M
    	while(i + 1 < n && arr[i+1] > arr[i]) i++;

//    	For upward climb from R2M
    	while(j - 1 > 0 && arr[j - 1] > arr[j]) j--;
    	
    	return i > 0 && i == j && j < n - 1;
    }

}
