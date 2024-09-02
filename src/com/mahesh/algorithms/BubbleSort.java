package com.mahesh.algorithms;

/**
 * Bubble Sort is a simple sorting algorithm which is used to sort a given set
 * of n elements provided in form of an array. Bubble Sort compares all elements
 * one by one and sort them based on their values. It compares adjacent elements and swaps
 * them.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {100,4,3,5,2,7,9,10,13,2,4,6};
        bubbleSort(array);
    }

    private static void bubbleSort(int[] array) {
        for(int i=0;i<array.length;i++) {
            for(int j=0;j<array.length-i-1;j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }

            }
        }
        System.out.println("Sorted elements are ");
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i]+" ");
        }
    }
}
