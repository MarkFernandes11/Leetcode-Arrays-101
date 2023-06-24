package com.practice.lc.conclusion;

import java.util.Arrays;

public class HeightChecker {

	public static void main(String[] args) {
		int[] heights = { 5,1,2,3,4 };
		int result = heightChecker(heights);
		
		System.out.println(result);
	}
	
    public static int heightChecker(int[] heights) {
        int result = 0;
        
        if(heights == null || heights.length == 0) return result;
        
        int[] expected = heights.clone();
        Arrays.sort(expected);
        
        for (int i = 0; i < expected.length; i++) {
			if(expected[i] != heights[i]) result++;
		}
        
        return result;
    }
    
    // TODO Need to try with without sorting

}
