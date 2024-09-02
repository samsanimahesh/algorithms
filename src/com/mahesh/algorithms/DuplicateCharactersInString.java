package com.mahesh.algorithms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersInString {
    public static void main(String[] args) {
        String input = "geeksforgeeks";
        Map<Character, Integer> characterCount = new HashMap<>();

        for(int i=0;i<input.length();i++) {
            if(characterCount.containsKey(input.charAt(i))) {
                characterCount.put(input.charAt(i),characterCount.get(input.charAt(i))+1);
            } else {
                characterCount.put(input.charAt(i), 1);
            }
        }

        for(Map.Entry<Character, Integer> entry: characterCount.entrySet()){
            if (entry.getValue() > 1) {
                System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue());
            }
        }
    }
}
