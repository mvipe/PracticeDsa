package com.mvipe.Arrays;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/contains-duplicate/submissions/
public class ContainsDuplicate {
    public static void main(String[] args) {

    }

    static boolean containsDuplicate(int[] nums) {
        Set<Integer> myset = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            myset.add(nums[i]);
        }

        return myset.size()!=nums.length;
    }

}
