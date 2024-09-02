package com.mahesh.algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestCommonSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String input = "abcabcbbcde";
//        String input = "bbbbb";
//        String input = "pwwkew";


        //O(n^2) approach
        Set<Character> characters = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i ; j < input.length(); j++) {
                if (!characters.contains(input.charAt(j))) {
                    characters.add(input.charAt(j));
                } else {
                    break;
                }
            }
        }

        System.out.println("Longest common substring length is " + characters);



        Map<Character, Integer> characterMap = new HashMap<>();
        int rightPointer = 0;
        int leftPointer = 0;
        int length = 0;

        for (rightPointer = 0; rightPointer < input.length(); rightPointer++) {

            if(characterMap.containsKey(input.charAt(rightPointer)) && characterMap.get(input.charAt(rightPointer)) >= leftPointer) {
                leftPointer = characterMap.get(input.charAt(rightPointer))+1;
            }

            length = Math.max(rightPointer-leftPointer+1, length);
            characterMap.put(input.charAt(rightPointer), rightPointer);
        }
        System.out.println("Longest common substring is "+length + " "+characterMap);
    }
}
