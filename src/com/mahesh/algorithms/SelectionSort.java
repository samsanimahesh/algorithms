package com.mahesh.algorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int[] inputArr = {9, 6, 5, 0, 8, 2, 7, 1, 3, 4};
        selectionSort(inputArr);
    }

    private static void selectionSort(int[] inputArr) {
        for(int i=0; i < inputArr.length; i++) {
            int minIndex = i;
            for(int j=i+1; j< inputArr.length;j++) {
                if(inputArr[j] < inputArr[minIndex]) {
                    minIndex = j;
                }

                int temp = inputArr[minIndex];
                inputArr[minIndex] = inputArr[i];
                inputArr[i] = temp;
            }
        }

        System.out.println("Sorted elements after selection sort are ");
        for(int i=0;i<inputArr.length;i++) {
            System.out.print(inputArr[i] +" ");
        }
    }
}
