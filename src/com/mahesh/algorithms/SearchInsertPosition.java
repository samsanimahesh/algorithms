package com.mahesh.algorithms;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] input = {1,3,5,6};
        int target = 7;

        for(int i =1;i<input.length;i++) {
            if(input[i-1] == target) {
                System.out.println("Element found in index "+(i-1));
            } else {

                if(target < input[i] && target > input[i-1]) {
                    System.out.println("Element can be inserted in index "+i);
                }

                if(target > input[i] && i == input.length-1) {
                    System.out.println("Element can be inserted in index "+(i+1));
                }
            }
        }
    }
}
