package com.mahesh.algorithms;

public class FibonacciSequence {
    public static void main(String[] args) {
        int start = 1;
        int old = 1;

        int range = 10;
        System.out.println("Fibonacci series");
        System.out.print(start+"\t"+old+"\t");

        int next = 1;
        for(int i=1;i<range;i++) {
             next = next+old;
             old = next;
        }
    }
}
