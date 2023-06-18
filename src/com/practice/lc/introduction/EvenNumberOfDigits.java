package com.practice.lc.introduction;

public class EvenNumberOfDigits {
	
	public static void main(String[] args) {
		int[] nums = {12,345,2,6,7896, 23, 456, 54678, 5461};
		int result = findNumbers(nums);
		System.out.println(result);
	}

	private static int findNumbers(int[] nums) {
        int result = 0;
        
        for (int i = 0; i < nums.length; i++) {
			result += (getNumberOfDigits(nums[i]) % 2 == 0) ? 1 : 0;
		}
        
        return result;
    }
	
	private static int getNumberOfDigits(int num) {
		int digits = 0;
		
		while(num != 0) {
			num /= 10;
			digits++;
		}
		
		return digits;
	}
}
