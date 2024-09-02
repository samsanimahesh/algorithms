package com.mahesh.algorithms;

public class FirstOccurrenceOfString {
    public static void main(String[] args) {

        String input = "sadbutsad";
        String needle = "sade";

        boolean isFound = false;
        for(int i=0;i<input.length();i++) {
            if(i+needle.length() <= input.length() && input.substring(i, i+needle.length()).equals(needle)) {
                isFound = true;
                System.out.println("Obtained at index "+i);
            }
        }
        if(!isFound) {
            System.out.println("not found");
        }

    }
}
