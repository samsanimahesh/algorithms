package com.mahesh.algorithms;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] input = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int output = input[0];
        int currSum = 0;

        for (int i = 1; i < input.length; i++) {
            if (currSum < 0) {
                currSum = 0;
            }
            currSum += input[i];
            output = Math.max(output, currSum);
        }
        System.out.println("output is " + output);


        // Bruteforce approach

        int finalOutput = 0;

        for (int i = 0; i < input.length; i++) {
            int sum = 0;
            for (int j = i ; j < input.length; j++) {
                sum += input[j];
                if (sum > finalOutput) {
                    finalOutput = sum;
                }
            }
        }

        System.out.println("Final sum with bruteforce " + finalOutput);

    }
}
