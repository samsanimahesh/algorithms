package com.mahesh.algorithms;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"};

        // the prefix has to be smaller so I am taking the smallest string in the array

        String smallest = strs[0];
        for(int i=0;i<strs.length;i++) {
            if(strs[i].length() < smallest.length()) {
                smallest = strs[i];
            }
        }

        boolean loopBroken = false;
        String subStr = "";
        for(int i=0;i<smallest.toCharArray().length;i++) {
            subStr = smallest.substring(0, i);
            for(int j = 0; j<strs.length; j++){
                if(!strs[j].startsWith(subStr)) {
                    loopBroken = true;
                    break;
                }
            }
            if(loopBroken) {
                subStr = smallest.substring(0, i-1);
                break;
            }

        }
        System.out.println("Longest Common Prefix "+subStr);
    }
}
