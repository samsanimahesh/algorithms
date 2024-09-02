package com.mahesh.algorithms;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3, 0, 0, 0};
        int[] arr2 = {2,5,6};

        int[] result = new int[arr1.length+arr2.length];

        for(int i=0;i<arr1.length;i++) {
            if(i < arr2.length && arr1[i] >= arr2[i]) {
                int temp = arr1[i+1];
                arr1[i+1] = arr2[i];

            }
        }

    }
}
