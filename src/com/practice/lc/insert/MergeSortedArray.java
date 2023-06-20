package com.practice.lc.insert;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		int m = 3, n = 3;
	
		merge(nums1, m, nums2, n);
		
		System.out.println(Arrays.toString(nums1));
	}
	
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null || nums2 == null || nums2.length == 0) return;
        int nums1Cur = m - 1;
        int nums2Cur = n - 1;
        
        for(int i = nums1.length - 1; i >= 0; i--) {
        	
        	if(nums1Cur < 0) {
        		nums1[i] = nums2[nums2Cur];
        		nums2Cur--;
        		continue;
        	}
        	
        	if(nums2Cur < 0) {
        		nums1[i] = nums1[nums1Cur];
        		nums1Cur--;
        		continue;
        	}
        	
        	if(nums1[nums1Cur] > nums2[nums2Cur]) {
        		nums1[i] = nums1[nums1Cur];
        		nums1Cur--;
        	} else {
        		nums1[i] = nums2[nums2Cur];
        		nums2Cur--;
        	}        	
        	
        }
    }
    
}
