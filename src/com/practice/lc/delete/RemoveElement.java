package com.practice.lc.delete;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		int[] nums = { 3, 2, 2, 3 }; // Input array
		int val = 3; // Value to remove
		int[] expectedNums = { 2, 2 }; // The expected answer with correct length.
										// It is sorted with no values equaling val.

		int k = removeElement(nums, val);

		assert k == expectedNums.length;
		Arrays.sort(nums, 0, k); // Sort the first k elements of nums
		for (int i = 0; i < expectedNums.length; i++) {
			assert nums[i] == expectedNums[i];
		}

		System.out.println(Arrays.toString(nums));
		System.out.println("k = " + k);
	}

	public static int removeElement(int[] nums, int val) {
		int cursor = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] != val) {
				nums[cursor++] = nums[i];
			}
		}

		return cursor;
	}

}
