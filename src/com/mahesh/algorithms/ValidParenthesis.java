package com.mahesh.algorithms;

public class ValidParenthesis {
    public static void main(String[] args) {

//        String input = "[{}()]"; // [{()}], (), [}, [{}()]
        String input = "[(])"; // [{()}], (), [}, [{}()]
        char [] arr = new char[input.length()];
        int k = -1;

        for(int i = 0; i < input.length(); i++) {
            char token = input.charAt(i);

            if(token == '{' || token == '[' || token == '('){
                arr[++k] = token;
            }

            if(token == '}' || token == ']' || token == ')'){
                if(k < 0)
                    System.out.println("Not valid");

                char c = arr[k];

                if((token == ')' && c == '(') ||
                                (token == ']' && c == '[') ||
                                (token == '}' && c == '{')) {
                    k--;
                }else{
                    System.out.println("Not Valid");
                }
            }
        }

        if(k == -1 ){
            System.out.println("Valid string");
        } else {
            System.out.println("Not a valid string");
        }
    }
}
