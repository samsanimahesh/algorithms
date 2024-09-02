package com.mahesh.algorithms;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        int[] input = {0,1,2,2,3,0,4,2};
        int val = 2;

        int j =0;
        for(int i=0;i< input.length;i++) {
            if(input[i] != val) {
                input[j] = input[i];
                j++;
            }
        }

        for(int i=0;i<j;i++) {
            System.out.println(input[i]);
        }

    }
}
