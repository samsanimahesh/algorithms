package com.mahesh.algorithms;

public class PalindromeNumber {
    public static void main(String[] args) {
        int input = -121;
        StringBuilder builder = new StringBuilder();
        if(input < 0) {
            builder.append("-");
            input = -input;
        }

        while(input > 0){
            int remainder = input%10;
            input = input/10;
            builder.append(remainder);
        }
        System.out.println("Reversed string is "+ builder);

        if(input == Integer.parseInt(builder.toString())){
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome number");
        }
    }
}
