package com.practice.lc.introduction;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		int[] input = {1,1,0,1,1,1,1,1,0,1,1,1};
		int result = maxConsecutiveOnes(input);
		System.out.println(result);
	}
	
	private static int maxConsecutiveOnes(int[] nums) {
		int maxConsecutiveOnes = 0;
		int consecutiveOnes = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == 1) {
				consecutiveOnes++;
				maxConsecutiveOnes = Math.max(maxConsecutiveOnes, consecutiveOnes);
			} else {
				consecutiveOnes = 0;
			}
		}
		
		return maxConsecutiveOnes;
	}

}
