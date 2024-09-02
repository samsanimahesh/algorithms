package com.mahesh.algorithms;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {
    public static void main(String[] args) {
        int[] input = {2,3,11,7,15,6};
        int target = 9;

        // O(n^2)
        for(int i=0,j=i+1;i<input.length && j< input.length;i++, j++) {
                if(input[i]+input[j] == target) {
                    System.out.println("Indexes are "+i+","+j);
            }

        }

        Map<Integer, Integer> counterMap = new HashMap<>();
        for(int i=0;i<input.length;i++) {
            counterMap.put(input[i], i);
        }

        for(int i=0;i<input.length;i++) {
            int remainder = target-input[i];
            if(counterMap.containsKey(remainder)) {
                System.out.println("Indexes are "+i+", "+counterMap.get(remainder));
            }
        }


    }
}
