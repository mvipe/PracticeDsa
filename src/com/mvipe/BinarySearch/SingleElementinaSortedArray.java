package com.mvipe.BinarySearch;
//https://leetcode.com/problems/single-element-in-a-sorted-array/

public class SingleElementinaSortedArray {
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }

    static int singleNonDuplicate(int[] nums) {
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int middle=start+(end-start)/2;

           if(middle!=0 && nums[middle]==nums[middle-1]){
                //finding if right of this middle element evry element has pair or not
                int rightLength=nums.length-1-middle;
                if(rightLength%2==0){
                    //try in left side
                    end=middle-1;

                }else{
                    //try in right side
                    start=middle+1;
                }
            }else if(middle!=nums.length-1 && nums[middle]==nums[middle+1]) {
                //finding if right of this middle element evry element has pair or not
                int rightLength=nums.length-1-middle;
                if(rightLength%2==0){
                    //try in left side
                    start=middle+1;

                }else{
                    //try in right side

                    end=middle-1;
                }
            }else{
               return nums[middle];
           }


        }
        return -1;
    }
}
