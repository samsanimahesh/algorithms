package com.mahesh.algorithms;

public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        int[] input = {1, 3, 5, 7, 9, 11, 13, 15};
        int target = 11;

        int left = 0;
        int right = input.length;

        while(left <= right) {
            int middle = (left + right) / 2;
            if (target == input[middle]) {
                System.out.println("Target " + target + " found at index " + (middle));
                break;
            }

            if (input[middle] < target) {
                left = middle+1;
            } else {
                right = middle -1;
            }
        }

    }
}
