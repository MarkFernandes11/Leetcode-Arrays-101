package com.practice.lc.conclusion;

import java.util.Arrays;

public class ThirdMaximumNumber {
	
	public static void main(String[] args) {
		int[] nums = {2147483647,-2147483648 };
		int result = thirdMax(nums);
		
		System.out.println(result);
	}
		
	// Intuition / Brute Force
    public static int thirdMax1(int[] nums) {
    	if(nums == null || nums.length == 0) return 0;
    	
    	Arrays.sort(nums);
    	
    	if(nums.length < 3) return nums[nums.length - 1];
    	
    	int high = 0;
    	int result = Integer.MAX_VALUE;
    	
    	for(int i = nums.length - 1; i >= 0; i--) {
    		
    		if(i == nums.length - 1) {
    			high++;
    			result = nums[i];
    			continue;
    		}
    		
    		if(nums[i] < result) {
    			result = nums[i];
    			high++;
    		}
    		
    		if(high == 3) break;
    	}
    	
    	return (high == 3) ? result : nums[nums.length - 1];
    }	

    public static int thirdMax(int[] nums) {
    	if(nums == null || nums.length == 0) return 0;
    	
    	Integer max = null;
    	Integer secondMax = null;
    	Integer thirdMax = null;
    	
    	for (Integer num : nums) {
    		if(num.equals(max) || num.equals(secondMax) || num.equals(thirdMax)) continue;
    		
			if(max == null || num > max) {
				thirdMax = secondMax;
				secondMax = max;
				max = num;
			} else if(secondMax == null || num > secondMax) {
				thirdMax = secondMax;
				secondMax = num;
			} else if(thirdMax == null || num > thirdMax) {
				thirdMax = num;
			}    		
		}
    	
    	return (thirdMax != null) ? thirdMax : max;
    }
    
}
