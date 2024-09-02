package com.mahesh.algorithms;

public class LongestCommonSubstring {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};

        int minLength = Integer.MAX_VALUE;
        String minStr = null;
        for(int i=0;i<strs.length;i++) {
            if(strs[i].length() < minLength) {
                minLength = strs[i].length();
                minStr = strs[i];
            }
        }

        String res = minStr;
        for(int i=0;i<strs.length;i++){
            while(!res.isEmpty()) {
                if(strs[i].startsWith(res)) {
                    break;
                } else {
                    res = res.substring(0, res.length()-1);
                }
            }
        }
        System.out.println("Shortest substring is "+res);

    }
}
