package com.practice.lc.conclusion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbers {
	
	public static void main(String[] args) {
		int[] nums = { 4,3,2,7,8,2,3,1 };
		List<Integer> result = findDisappearedNumbers(nums);
		
		System.out.println(result);
	}

	// O(n) Time complexity
	// O(n) Space complexity (Since creating new array)
    public static List<Integer> findDisappearedNumbers1(int[] nums) {
    	int[] temp = new int[nums.length+1];
    	List<Integer> result = new ArrayList<Integer>();

    	for (int num : nums) {
			temp[num] = num;
		}
    	
    	System.out.println(Arrays.toString(temp));
    	
    	for (int i = 1; i < temp.length; i++) {
			if(temp[i] == 0) result.add(i);
		}
    	
        return result;
    }

	// O(n) Time complexity
    public static List<Integer> findDisappearedNumbers(int[] nums) {
    	List<Integer> result = new ArrayList<Integer>();
    	
    	for (int i = 0; i < nums.length; i++) {
    		int absValue = Math.abs(nums[i]);
			nums[absValue - 1] = Math.abs(nums[absValue - 1]) * -1; 
		}
    	
    	for (int i = 0; i < nums.length; i++) {
			if(nums[i] > 0) result.add(i+1);
		}
    	
        return result;
    }
    
}
