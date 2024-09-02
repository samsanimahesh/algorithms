package com.mahesh.algorithms;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        List<Integer> removedList = new ArrayList<>();
        for (int num : nums) {
            if (!removedList.contains(num)) {
                removedList.add(num);
            }
        }
        System.out.println("Removed list is "+removedList);


        int pointer = 0;
        for(int i=1;i<nums.length;i++) {
            if(nums[i-1] != nums[i]) {
                nums[pointer] = nums[i-1];
                pointer = pointer+1;
            }
        }
        nums[pointer++] = nums[nums.length-1];
        System.out.println(nums);
        System.out.println(pointer);
        for(int i =0;i<pointer;i++) {
            System.out.print(nums[i]+"\t");
        }


    }

}
