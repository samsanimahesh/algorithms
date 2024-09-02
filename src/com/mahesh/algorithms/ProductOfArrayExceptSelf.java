package com.mahesh.algorithms;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
//        int[] nums = {4,5,1,8,2};
//        int[] nums = {-1, 1, 0, -3, 3};

        // O(n^2)
        int[] result = new int[nums.length];
        int multiple = 1;
        for (int i = 0; i < nums.length; i++) {
            multiple = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    multiple *= nums[j];
                }
            }
            result[i] = multiple;
        }

        // O(n)
        result[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = result[i] * right;
            right = right * nums[i];
        }

        System.out.print("Except self O(n) ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(+result[i] + "\t");
        }

    }
}
