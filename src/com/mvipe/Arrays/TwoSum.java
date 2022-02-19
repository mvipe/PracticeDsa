package com.mvipe.Arrays;
//leetcode
public class TwoSum {
    public static void main(String[] args) {
        int [] nums=new int[]{3,2,3};
        System.out.println(twoSum(nums,6));
    }

    static int[] twoSum(int[] nums, int target) {

        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target) {
                    int[] res=new int[]{i,j};
                    return res;
                }
            }
        }

        int[] res=new int[]{-1,-1};
        return res;
    }
}
