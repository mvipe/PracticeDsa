package com.mvipe.Recursion.Basic;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int arr[]=new int[]{2,4,1,5,7};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    static void quickSort(int arr[],int low,int high){

        if(low>=high){
            return;
        }

        int s=low;
        int e=high;
        int m=s+(e-s)/2;
        int pivot=arr[m];

        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }

            while(arr[e]>pivot){
                e--;
            }

            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }

        }


        //now my pivot is at correct index please sort two halves
        quickSort(arr,low,e);
        quickSort(arr,s,high);
    }
}
