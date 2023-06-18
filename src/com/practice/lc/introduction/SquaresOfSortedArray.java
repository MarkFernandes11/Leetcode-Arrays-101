package com.practice.lc.introduction;

import java.util.Arrays;

public class SquaresOfSortedArray {
	
	public static void main(String[] args) {
		int[] nums = {-7,-3,2,3,11};
		int[] result = sortedSquares(nums);
		System.out.println(Arrays.toString(result));
	}

	// Trivial approach
	private static int[] sortedSquares1(int[] nums) {
        
		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] * nums[i];
		}
		
		Arrays.sort(nums);
		
		return nums;
    }
	
	// Optimized approach
	private static int[] sortedSquares(int[] nums) {
		int[] result = new int[nums.length];
		int start = 0;
		int end = nums.length - 1;
		
		for(int i = end; i >= 0; i--) {
			if(Math.abs(nums[start]) >= Math.abs(nums[end])) {
				result[i] = nums[start] * nums[start];
				start++;
			} else {
				result[i] = nums[end] * nums[end];
				end--;
			}
		}
		
		return result;
    }
}
