package com.mvipe.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;
        int ans = binarySearchOrder(arr, target,true);
        System.out.println(ans);
    }

    // return the index
    // return -1 if it does not exist
    static int binarySearchOrder(int[] arr, int target,boolean isIncr) {
        int start = 0;
        int end = arr.length - 1;

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
                }else {
                    end = mid - 1;
                }

            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
