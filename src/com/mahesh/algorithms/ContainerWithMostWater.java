package com.mahesh.algorithms;

/**
 * Incomplete Solution needs to revisit.
 */
public class ContainerWithMostWater {
    public static void main(String[] args) {
//        int[] input = {1, 3, 2, 5, 25, 24, 5};
//        int[] input = {1, 1};
//        int[] input = {4, 3, 2, 1, 4};
        int[] input = {1,8,6,2,5,4,8,3,7};

        int maxArea = 0;
        // O(n^2)
        for(int i=0;i<input.length;i++) {
            for(int j=i+1;j<input.length;j++) {
                int length = input[i]<input[j] ? input[i]:input[j];
                int width = j-i;

                int area = length*width;

                if(area > maxArea) {
                    maxArea = area;
                }
            }
        }
        System.out.println("Maximum area is "+maxArea);

        //O(n)
        int j =0;
        for(int i=0;i<input.length;i++) {
            int length = input[i] < input[j + 1] ? input[i] : input[j + 1];
            int width = (j+1) - i;

            int area = length * width;

            if (area > maxArea) {
                maxArea = area;
            }
        }
        System.out.println("Maximum area is O(n) "+maxArea);

    }
}
