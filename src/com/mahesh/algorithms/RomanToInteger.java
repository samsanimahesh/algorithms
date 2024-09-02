package com.mahesh.algorithms;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        Map<Character, Integer> romanToInteger = new HashMap<>(){{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        String roman = "XV";

        char[] romanChars = roman.toCharArray();

        int sum = 0;
        int prevValue = 0;
        for(int i=0;i<romanChars.length;i++) {
           int currentValue = romanToInteger.get(romanChars[i]);
           if(i==0){
               sum += currentValue;
           } else {
               prevValue = romanToInteger.get(romanChars[i-1]);
               if(prevValue > currentValue) {
                   sum += currentValue;
               } else if(prevValue<currentValue){
                   sum -= prevValue;
                   int valueToAdd = (currentValue-prevValue);
                   sum +=valueToAdd;
               } else{
                   sum += currentValue;
               }
           }
        }
        System.out.println("Sum is "+sum);
    }
}
