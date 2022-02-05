package com.mvipe.BinarySearch;

public class Floar {
    public static void main(String[] args) {
        int [] arr=new int[]{2,3,5,9,14,16,18};
        System.out.println(floar(arr,19));
    }

    static int floar(int[] arr,int target){
        if(target<arr[0]){
            return -1;
        }

        int start=0;
        int end=arr.length-1;

        while(start<end){
            int middle=start+(end-start)/2;
            if(arr[middle]==target){
                return arr[middle];
            }else if(arr[middle]<target){
                start=middle+1;
            }else{
                end=middle-1;
            }
        }

        if(start==end){
            if(arr[start]==target) return target;
            else return arr[start];
        }

        return -1;
    }
}
