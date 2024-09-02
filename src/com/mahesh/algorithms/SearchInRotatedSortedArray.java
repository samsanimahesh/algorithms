package com.mahesh.algorithms;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] input = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int left = 0;
        int right = input.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (target == input[mid]) {
                System.out.println("Found target element at " + mid);
            }

            if (input[left] <= input[mid]) {
                if (target < input[left] || target > input[mid]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (target < input[mid] || target > input[right]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }

    }
}
