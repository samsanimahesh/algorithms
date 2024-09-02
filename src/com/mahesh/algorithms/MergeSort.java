package com.mahesh.algorithms;

public class MergeSort {
    public static void main(String[] args) {
        int[] input = {9, 6, 5, 0, 8, 2, 7, 1, 3, 4};
        mergeSort(input);
        System.out.println("Elements after merge sort are ");
        for(int i=0;i<input.length;i++) {
            System.out.print(input[i]+" ");
        }
    }

    private static void mergeSort(int[] input) {
        int length = input.length;
        if(length<=1) return;
        int middle = length/2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length-middle];
        int i = 0;
        int j = 0;
        for(;i<length;i++) {
            if(i<middle) {
                leftArray[i] = input[i];
            } else {
                rightArray[j] = input[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        mergeElements(leftArray, rightArray, input);
    }

    private static void mergeElements(int[] leftArray, int[] rightArray, int[] input) {
       int leftSize = input.length/2;
       int rightSize = input.length - leftSize;

       int i=0, l=0, r=0;

       while(l < leftSize && r< rightSize) {
          if(leftArray[l] < rightArray[r]) {
              input[i] = leftArray[l];
              i++;
              l++;
          }else {
              input[i] = rightArray[r];
              i++;
              r++;
          }
       }

       while(l < leftSize) {
           input[i] = leftArray[l];
           i++;
           l++;
       }

       while(r<rightSize) {
           input[i] = rightArray[r];
           i++;
           r++;
       }
    }
}
