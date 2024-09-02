package com.mahesh.algorithms;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {9, 6, 5, 0, 8, 2, 7, 1, 3, 4};
        int length = array.length;
        for(int i = 0;i < length;i++) {
            int j = i+1;
            while(j < length) {
                if(array[i]> array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                j++;
            }

        }
        System.out.println("Sorted after insertion sort are ");
        for(int i =0;i<array.length;i++) {
            System.out.print(array[i]+" ");
        }
    }
}
