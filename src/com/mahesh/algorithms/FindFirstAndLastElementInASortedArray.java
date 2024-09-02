package com.mahesh.algorithms;

import java.util.ArrayList;
import java.util.List;

public class FindFirstAndLastElementInASortedArray {
    public static void main(String[] args) {
        int[] input = {5,7,8,8,8,10};
        // O(n) approach
        int target = 8;

        List<Integer> indexes = new ArrayList<>();
        for(int i =0;i<input.length;i++) {
            if(target == input[i]) {
                indexes.add(i);
            }
        }
        System.out.println("Found indexes are "+indexes);
        // O(log n) approach

        System.out.println("First Occurance is "+findFirstIndex(input, target));
        System.out.println("Last occurance is "+findLastIndex(input, target));

    }

    private static int findLastIndex(int[] input, int target) {
        int left = 0;
        int right = input.length;

        int lastOccurance = -1;

        while(left <= right) {
            int mid = (left+right)/2;

            if(target == input[mid]) {
                lastOccurance = mid;
                left = mid + 1;
            } else if(input[mid] < target) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return lastOccurance;
    }

    private static int findFirstIndex(int[] input, int target) {
        int left = 0;
        int right = input.length;
        int firstOccurance = -1;
        while(left <= right) {
            int mid = (left+right)/2;

            if(target == input[mid]) {
                firstOccurance = mid;
                right = mid -1;
            } else if(input[mid] < mid) {
                left = mid+1;
            } else {
                right = mid -1;
            }
        }
        return firstOccurance;
    }
}
