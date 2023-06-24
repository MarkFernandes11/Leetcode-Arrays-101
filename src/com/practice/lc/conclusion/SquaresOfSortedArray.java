package com.practice.lc.conclusion;

import java.util.Arrays;

public class SquaresOfSortedArray {

	public static void main(String[] args) {
		int[] nums = { -4,-1,0,3,10 };
		int[] result = sortedSquares(nums);
		
		System.out.println(Arrays.toString(result));

	}

	public static int[] sortedSquares(int[] nums) {
		int[] result = new int[nums.length];
		int left = 0;
		int right = nums.length - 1;
		
		for (int i = right; i >= 0; i--) {
			if(Math.abs(nums[left]) > Math.abs(nums[right])) {
				result[i] = nums[left] * nums[left];
				left++;
			} else {
				result[i] = nums[right] * nums[right];
				right--;
			}			
		}
		
		return result;
	}
	
}
