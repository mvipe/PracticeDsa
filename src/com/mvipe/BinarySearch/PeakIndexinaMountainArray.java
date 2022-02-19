package com.mvipe.BinarySearch;

public class PeakIndexinaMountainArray {
    public static void main(String[] args) {
        int[] arr=new int[]{0,1,0};
        System.out.println(peakIndexInMountainArray(arr));

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
