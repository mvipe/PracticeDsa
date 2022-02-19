package com.mvipe.BinarySearch;

public class FindInMountainArray {
    public static void main(String[] args) {
       int[] arr=new int[]{3,5,3,2,0};
        System.out.println(findInMountainArray(3,arr));
    }

    static int findInMountainArray(int target, int[] mountainArr) {
        int peekIndex=peakIndexInMountainArray(mountainArr);

        int targetIndex=binarySearch(mountainArr,target,0,peekIndex,true);
        if(targetIndex==-1){
            return binarySearch(mountainArr,target,peekIndex,mountainArr.length-1,false);
        }
        return targetIndex;

    }

    static int binarySearch(int[] arr, int target,int start,int end,boolean isIncr) {


        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                if(isIncr){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }

            } else if (target > arr[mid]) {
                if(isIncr){
                    start = mid + 1;

                }else{
                    end = mid - 1;
                }
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start=1;
        int end=arr.length-2;

        while(start<=end){
            int middle=start+(end-start)/2;

            if(arr[middle]>arr[middle+1] && arr[middle]>arr[middle-1]){
                return middle;
            }
            else if(arr[middle]>arr[middle+1] && arr[middle]<arr[middle-1]){
                end=middle-1;
            }else{
                start=middle+1;
            }

        }

        return -1;
    }
}
