package com.mahesh.algorithms;

import java.util.Stack;

public class ReverseWordsInString {
    public static void main(String[] args) {
//        String input = "Hello World";
        String input = "the sky is blue";

        String[] splitted = input.split(" ");

        for(int i =splitted.length-1; i>=0;i--) {
            System.out.print(splitted[i] +" ");
        }

        Stack<String> stacked = new Stack<>();
        for(int i =0;i<splitted.length;i++) {
            stacked.push(splitted[i]);
        }

        String lastElement;
        while((lastElement=stacked.pop()) != null) {
            System.out.print(lastElement +" ");
        }

    }
}
