package com.mvipe.Arrays;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] res=new int[]{1};
        System.out.println(maxSubArray(res));
    }

   static  int maxSubArray(int[] nums) {
        int maxValue=Integer.MIN_VALUE;

        int leftSum=0;
        int rightSum=0;

        int totalSum=0;
        for(int i=0;i<nums.length;i++){
            totalSum+=nums[i];
        }

        for(int i=0;i<nums.length;i++){
            for(int j=nums.length-1;j>=i;j--){
                int curSum=totalSum-leftSum-rightSum;

                //comparing from maxValue
                if(maxValue<curSum){
                    maxValue=curSum;
                }


                rightSum+=nums[j];


            }
            leftSum+=nums[i];
            rightSum=0;
        }

        return maxValue;
    }
}
