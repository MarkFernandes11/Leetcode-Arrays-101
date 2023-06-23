package com.practice.lc.inplace;

import java.util.Arrays;

public class MoveZeroes {
	
	public static void main(String[] args) {
		int[] nums = { 0,0,1,0,3,12 };
		moveZeroes2(nums);
		
		System.out.println(Arrays.toString(nums));
	}

	private static void moveZeroes(int[] nums) {
		int index = 0;

		// Loop to insert all non zero elements
		for(int num : nums) {
			if(num != 0) nums[index++] = num;
		}

		// Loop to insert all zero elements at end
		for (int i = index; i < nums.length; i++) {
			nums[i] = 0;
		}
	}
	
	private static void moveZeroes2(int[] nums) {
		int snowBallSize = 0;

		for (int i = 0; i < nums.length; i++) {
			if(nums[i] != 0) {
				int temp = nums[i];
				nums[i] = 0;
				nums[i - snowBallSize] = temp;
			} else {
				snowBallSize++;
			}
		}
	}

}
