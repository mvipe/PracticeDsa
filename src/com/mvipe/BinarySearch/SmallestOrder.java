package com.mvipe.BinarySearch;
//Find Smallest Letter Greater Than Target
//leetcode-https://leetcode.com/problems/find-smallest-letter-greater-than-target/


public class SmallestOrder {
    public static void main(String[] args) {
        char [] arr=new char[]{'c','f','g'};
        System.out.println(nextGreatestLetter(arr,'z'));
    }

    static char nextGreatestLetter(char[] letters, char target) {

        int start=0;
        int end=letters.length-1;

        while(start<=end){
            int middle=start+(end-start)/2;
            if(letters[middle]==target){
                start=middle+1;
            }else if(letters[middle]>target){
                end=middle-1;
            }else{
                start=middle+1;
            }
        }
//        if(start>letters.length-1) return letters[0];
//        return letters[start];

        return letters[start % letters.length];
    }
}
