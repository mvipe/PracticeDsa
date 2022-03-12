package com.mvipe.Recursion.Basic;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int arr[]=new int []{88,76,55,6,0,-5};
        System.out.println(Arrays.toString(mergesort(arr,0,arr.length-1)));
    }

    private static int[] mergesort(int[] arr,int s,int e) {
        //base case
        if(e-s<=0){
            if(arr.length==0){
                return new int[]{};
            }
            return new int[]{arr[s]};
        }



        int res[];

        int m=s+(e-s)/2;
        int left[]=mergesort(arr,s,m);
        int right[]=mergesort(arr,m+1,e);

        res=new int[left.length+right.length];

        //merge left and right
        int leftInd=0;
        int rightInd=0;
        for (int i = 0; i < res.length; i++) {
            if(leftInd>=left.length ){
                res[i]=right[rightInd];
                rightInd++;
            }else if(rightInd>=right.length){
                res[i]=left[leftInd];
                leftInd++;
            }
            else if(left[leftInd]>right[rightInd]){
                res[i]=right[rightInd];
                rightInd++;
            }else{
                res[i]=left[leftInd];
                leftInd++;
            }
        }


        return res;


    }
}
