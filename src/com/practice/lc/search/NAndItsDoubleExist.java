package com.practice.lc.search;

import java.util.HashSet;

public class NAndItsDoubleExist {

	public static void main(String[] args) {
		int[] nums = { -2,0,10,-19,4,6,-8};
		System.out.println(checkIfExist(nums));
	}
	
	// Intuition
    public static boolean checkIfExist1(int[] arr) {
    	for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i != j && arr[i] == 2 * arr[j]) return true;
			}
		}
    	
    	return false;
    }
    
	// Optimized approach
    public static boolean checkIfExist(int[] arr) {
    	HashSet<Integer> set = new HashSet<>();
    	
    	for (int num : arr) {
			
    		if(set.contains(2 * num) || (num % 2 ==  0 && set.contains(num / 2))) return true;
    		
    		set.add(num);
		}
    	
    	return false;
    }

}
