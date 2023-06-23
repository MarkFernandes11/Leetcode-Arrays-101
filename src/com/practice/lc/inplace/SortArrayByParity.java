package com.practice.lc.inplace;

import java.util.Arrays;

public class SortArrayByParity {

	public static void main(String[] args) {
		int[] nums = { 3,1,2,4 };
		int[] result = sortArrayByParity(nums);
		
		System.out.println(Arrays.toString(result));
	}
	
    public static int[] sortArrayByParity(int[] nums) {
        int oddNoIndex = 0;
        
        for (int i = 0; i < nums.length; i++) {
        	if(nums[i] % 2 == 0) {
        		int temp = nums[i];
        		nums[i] = nums[i - oddNoIndex];
        		nums[i - oddNoIndex] = temp;
        	} else {
        		oddNoIndex++;
        	}        	
		}
    	
    	return nums;
    }

}
