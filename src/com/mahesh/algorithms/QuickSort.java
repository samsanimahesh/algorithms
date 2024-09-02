package com.mahesh.algorithms;

public class QuickSort {
    public static void main(String[] args) {
        int[] input = {9, 6, 5, 0, 8, 2, 7, 1, 3, 4};
        quickSort(input, 0, input.length-1 );

        System.out.println("Elements after quick sort are ");
        for(int i=0;i<input.length;i++) {
            System.out.print(input[i] +" ");
        }
    }

    private static void quickSort(int[] input, int start, int end) {
        if(start<end){
            int pivot = partition(input, start, end);
            quickSort(input, start, pivot - 1);
            quickSort(input, pivot + 1, end);
        }
    }

    private static int partition(int[] input, int start, int end) {
        int pivot = input[end];
        int i = start-1;

        for(int j=start; j<end; j++) {
            if(input[j] <= pivot) {
                i++;
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
            }
        }

        int temp = input[i+1];
        input[i+1] = input[end];
        input[end] = temp;
        return i+1;
    }
}
