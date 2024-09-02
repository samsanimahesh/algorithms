package com.mahesh.algorithms;

import java.util.Arrays;

public class CountOfNumberAfterSelf {
    public static void main(String[] args) {
        int[] nums = {5,2,6,1};
        int[] output = new int[nums.length];


        // O(n^2) approach
        for(int i =0;i<nums.length;i++) {
            for(int j =i+1;j< nums.length;j++) {
                if(nums[j] < nums[i]) {
                    output[i]++;
                }
            }
        }

    }
}
