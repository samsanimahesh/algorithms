package com.mahesh.algorithms;

public class SquareRoot {
    public static void main(String[] args) {
        int x = 8;
        if(x == 0 || x == 1) {
            System.out.println(x);
        }

        long high = (x >> 1) + 1;
        long low = 1;

        while(high - low != 1){
            long mid = low + (high - low)/2;
            if(mid * mid > x){
                high = mid;
            }else{
                low = mid;
            }
        }

        System.out.println("Square root is "+low);
    }
}
