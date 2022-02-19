package com.mvipe.BinarySearch;
//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class SearchinRotatedSortedArray {
    public static void main(String[] args) {
        int[] temp = new int[]{4, 5, 6, 7, 0, 1, 2};

        System.out.println(search(temp, 0));
    }

    static int search(int[] nums, int target) {

        int pivot=findPivot(nums);

        if(pivot ==-1){
            return binarySearch(nums,target,0,nums.length-1);
        }
        if(nums[pivot]==target){
            return pivot;
        }
        if(nums[0]<=target){
            return binarySearch(nums,target,0,pivot-1);
        }

        return binarySearch(nums,target,pivot+1,nums.length-1);


    }

    static int binarySearch(int[] nums,int target,int start,int end){


        while(start<=end){
            int middle=start+(end-start)/2;

            if(nums[middle]==target){
                return middle;
            }
            else if(nums[middle]>target){
                end=middle-1;
            }
            else if(nums[middle]<target){
                start=middle+1;
            }
        }


        return -1;
    }




    static int findPivot(int []arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }else if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if(arr[mid]<=arr[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }



        return -1;

    }

}
