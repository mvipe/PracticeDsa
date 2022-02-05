package com.mvipe.BinarySearch;
//ceiling of a number
//ceiling of a number in an array = smallest element in an array
//greater than or equal to target
//eg - arr=[2,3,5,9,14,16,18]
//     target=14 , ceiling =14
//     target=15 , ceiling =16


public class Ceiling {
    public static void main(String[] args) {
        int [] arr=new int[]{2,3,5,9,14,16,18};
        System.out.println(ceiling(arr,19));
    }

    // return the index of smallest no >= target
    static int ceiling(int[] arr, int target) {

        // but what if the target is greater than the greatest number in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return start;
    }

}
