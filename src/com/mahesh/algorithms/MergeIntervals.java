package com.mahesh.algorithms;

import java.util.ArrayList;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
//        Integer[][] input = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        Integer[][] input = {{1, 4}, {4, 5}, {8, 10}, {15, 18}};


        List<Integer[]> output = new ArrayList<>();
        for (int i = 1; i < input.length; i++) {
            if (input[i - 1][1] >= input[i][0]) {
                input[i - 1][1] = input[i][i];
                output.add(input[i - 1]);
            } else {
                output.add(input[i]);
            }
        }

        for (int i = 0; i < output.size(); i++) {
            System.out.println("[" + output.get(i)[0] + ", " + output.get(i)[1] + "]");
        }
    }
}
