package com.mvipe.Recursion.Practice;

//algoexpert staircaseTraversal Problem - recursion

public class stairCaseTraversal {
    public static void main(String[] args) {
        System.out.println(staircaseTraversal(3,2)+"");
    }

     static int staircaseTraversal(int height, int maxSteps) {
        //Base Case
        if(height<=0) return 1;

        int count=0;
        for( int i=1;i<=maxSteps;i++){
            if(height-i>=0){
                count+=staircaseTraversal(height-i,maxSteps);
            }

        }





        return count;
    }
}
