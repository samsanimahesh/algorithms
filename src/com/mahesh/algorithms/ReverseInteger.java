package com.mahesh.algorithms;

public class ReverseInteger {
    public static void main(String[] args) {
        Integer input = -345;
        StringBuilder builder = new StringBuilder();
        if(input<0) {
            builder.append("-");
            input = -input;
        }

        while(input > 0){
            int remainder = input%10;
            input = input/10;
            builder.append(remainder);
        }
        System.out.println("Reversed string is "+ builder);

    }
}
