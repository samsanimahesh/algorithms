package com.mahesh.algorithms;

import java.util.ArrayList;
import java.util.List;

public class PlusOneProblem {
    public static void main(String[] args) {
//        int[] input = {1,2,3};
        int[] input = {9};

        int sum = 0;
        for(int i=0;i<input.length;i++) {
            sum += input[i] * Math.pow(10, input.length-i-1);

        }

        sum+=1;
        System.out.println("Sum is "+sum);
        List<Integer> al = new ArrayList<>();
    }
}


