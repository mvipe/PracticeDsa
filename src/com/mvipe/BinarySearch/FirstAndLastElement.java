package com.mvipe.BinarySearch;

import java.util.Arrays;

//leetcode-Find First and Last Position of Element in Sorted Array
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FirstAndLastElement {
    public static void main(String[] args) {
        int[] nums=new int[]{};

        int [] res=searchRange(nums,4);
        System.out.println(Arrays.toString(res));
    }

    static int[] searchRange(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;

        int startingIndex=-1;
        int endingIndex=-1;

        if(nums.length==0) return new int[]{startingIndex,endingIndex};
        if( target<nums[0] || target>nums[end]) return new int[]{startingIndex,endingIndex};

        //checking starting index
        while(start<=end){
            int middle=start+(end-start)/2;

            if(nums[middle]==target){
                if(middle!=0 && nums[middle-1]==target){
                    end=middle-1;
                }else {
                    startingIndex=middle;
                    break;
                }
            }else if(nums[middle]>target){
                end=middle-1;
            }else{
                start=middle+1;
            }
        }

        //new starting and last position
        start=startingIndex;
        end=nums.length-1;
        while(start<=end){
            int middle=start+(end-start)/2;

            if(nums[middle]==target){
                if(middle!=nums.length-1 && nums[middle+1]==target){
                    start=middle+1;
                }else {
                    endingIndex=middle;
                    break;
                }
            }else if(nums[middle]>target){
                end=middle-1;
            }else{
                start=middle+1;
            }
        }

        int[] res=new int[]{startingIndex,endingIndex};
        return res;
    }
}
