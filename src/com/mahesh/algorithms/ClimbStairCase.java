package com.mahesh.algorithms;

public class ClimbStairCase {
    public static void main(String[] args) {
        int n =5;

        if(n == 1 || n == 2 ) {
            System.out.println("number of ways "+n);
            return;
        }

        int a =1, b =2;
        int res = 0;
        for(int i=3;i<n+1;i++) {
            res = a+b;
            a = b;
            b = res;
        }
        System.out.println("number of steps are "+res);

    }
}
