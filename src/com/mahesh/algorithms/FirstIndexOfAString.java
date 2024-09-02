package com.mahesh.algorithms;

public class FirstIndexOfAString {
    public static void main(String[] args) {
        String input = "sadbutsad";
        String target = "sad";

        for(int i=0;i<target.length();i++) {
            for(int j=0;j<input.length();j++) {
                if(target.charAt(i) == input.charAt(i)) {

                }
            }
        }
    }
}
