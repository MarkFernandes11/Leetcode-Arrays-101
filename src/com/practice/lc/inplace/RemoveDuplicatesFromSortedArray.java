package com.practice.lc.inplace;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4}; // Input array
		int[] expectedNums = {0,1,2,3,4}; // The expected answer with correct length

		int k = removeDuplicates(nums);

		assert k == expectedNums.length;
		for (int i = 0; i < k; i++) {
		    assert nums[i] == expectedNums[i];
		}

		System.out.println(Arrays.toString(nums));
		System.out.println("k = " + k);		
	}
	
	public static int removeDuplicates(int[] nums) {
		int index = 0;
		
		if(nums == null || nums.length == 0) return index;
		
		for (int i = 0; i < nums.length; i++) {
			if(i == 0 || (nums[i] != nums[i-1])) {
				nums[index++] = nums[i];
			}
		}
		
		return index;
	}

}
