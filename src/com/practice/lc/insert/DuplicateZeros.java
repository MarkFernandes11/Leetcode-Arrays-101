package com.practice.lc.insert;

import java.util.Arrays;

public class DuplicateZeros {

	public static void main(String[] args) {
		int[] nums = {0,0,0,0,0,0,0};
//		int[] nums = {1,0,2,3,0,4,5,0};
		
		duplicateZeros(nums);

		System.out.println(Arrays.toString(nums));
	}
	
	// Using additional memory
    public static void duplicateZeros1(int[] arr) {
    	int[] temp = arr.clone();
    	int cur = 0;
    	
    	if(arr == null || arr.length <= 1) return;
        
        for (int j = 0; j < temp.length; j++) {
        	if(cur >= arr.length) break;
        	
			if(temp[j] != 0) arr[cur++] = temp[j];
			else {
				arr[cur++] = 0;
				if(cur < arr.length) arr[cur++] = 0;
				else break;
			}
		}        
    }	

    // Optimized solution
    public static void duplicateZeros(int[] arr) {
    	if(arr == null || arr.length <= 1) return;
    	
    	int zeros = (int) Arrays.stream(arr).filter(num -> num == 0).count();
    	int size = arr.length + zeros;
    	
    	for (int i = arr.length - 1, j = size - 1; i < j; i--, j--) {
			if(arr[i] != 0) {
				if(j < arr.length) arr[j] = arr[i];
			} else {
				if(j < arr.length) arr[j] = 0;
				j--;
				if(j < arr.length) arr[j] = 0;
			}
		}    	
    }
    
}