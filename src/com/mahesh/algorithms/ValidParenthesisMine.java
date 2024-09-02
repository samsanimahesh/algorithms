package com.mahesh.algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesisMine {
    public static void main(String[] args) {
        Map<Character,Character> charMap = new HashMap<>();

        charMap.put('[', ']');
        charMap.put('{', '}');
        charMap.put('(', ')');

//        String input ="[(])";
//        String input ="((())";
        String input =")))))";

        Stack<Character> parentStack = new Stack<>();
        boolean invalidChar = false;
        for(int i=0;i<input.toCharArray().length;i++) {
            if(i == 0 && (input.charAt(i) == '}' || input.charAt(i) == ')' || input.charAt(i) == ']')){
                invalidChar = true;
                break;
            }
            if(charMap.containsKey(input.charAt(i))) {
                parentStack.push(input.charAt(i));
            } else if(!parentStack.isEmpty()){
                char lastElement = charMap.get(parentStack.lastElement());
                if(lastElement == input.charAt(i)){
                    System.out.println("Popped are "+parentStack.pop()+","+input.charAt(i));
                }
            } else {
                invalidChar =true;
            }
        }
        if(!invalidChar && parentStack.isEmpty()) {
            System.out.println("Valid String");
        } else {
            System.out.println("Invalid String");
        }
    }
}
