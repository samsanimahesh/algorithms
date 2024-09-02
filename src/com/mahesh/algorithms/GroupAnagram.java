package com.mahesh.algorithms;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] input = {"aab", "bba", "baa", "abbccc"};

        Map<String, List<String>> frequencyMap = new HashMap<>();
        for(String str: input) {
            String frequencyStr = getFrequencyString(str);
            System.out.println("Frequency string is "+frequencyStr);

            if(!frequencyMap.containsKey(frequencyStr)) {
                List<String> groupedStrings = new ArrayList<>();
                groupedStrings.add(str);
                frequencyMap.put(frequencyStr, groupedStrings);
            }else {
                List<String> existing = frequencyMap.get(frequencyStr);
                existing.add(str);
                frequencyMap.put(frequencyStr, existing);
            }
        }


        for(String key: frequencyMap.keySet()) {
            System.out.println(frequencyMap.get(key));
        }

    }

    private static String getFrequencyString(String str) {

        int[] freq = new int[26];

        for(char c: str.toCharArray()) {
            freq[c-'a']+=1;
        }

        StringBuilder frequencyString = new StringBuilder();

        char ch = 'a';
        for(int i: freq) {
            frequencyString.append(ch);
            frequencyString.append(i);
            ch++;
        }
        System.out.println("Frequency string is "+frequencyString.toString());
        return frequencyString.toString();

    }
}
