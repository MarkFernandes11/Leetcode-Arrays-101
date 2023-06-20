package com.practice.lc.delete;

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

	private static int removeDuplicates(int[] nums) {
		int cursor = 1;
		
		for (int i = 1; i < nums.length; i++) {
			if(nums[i] != nums[i - 1]) {
				nums[cursor++] = nums[i];
			}
		}
		
		return cursor;
	}

}
