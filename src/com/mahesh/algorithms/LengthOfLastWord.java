package com.mahesh.algorithms;

public class LengthOfLastWord {
    public static void main(String[] args) {
//        String input = "Hello World";
//        String input = "   fly me   to   the moon  ";
        String input = "luffy is still joyboy";
        String[] splitted = input.trim().split(" ");

        System.out.println("Length of last word: "+splitted[splitted.length-1].length());
    }
}
