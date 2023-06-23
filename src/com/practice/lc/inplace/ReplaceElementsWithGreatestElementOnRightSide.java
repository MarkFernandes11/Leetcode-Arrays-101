package com.practice.lc.inplace;

import java.util.Arrays;

public class ReplaceElementsWithGreatestElementOnRightSide {

	public static void main(String[] args) {
		int[] nums = { 17,18,5,4,6,1 };
		int[] result = replaceElements(nums);
		
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] replaceElements(int[] arr) {
		if(arr == null || arr.length == 0) return arr;
		
		int max = -1;
		
		for (int i = arr.length - 1; i >= 0; i--) {
			int temp = arr[i];
			arr[i] = max;
			max = Math.max(max, temp);
		}
		
		return arr;
    }

}
