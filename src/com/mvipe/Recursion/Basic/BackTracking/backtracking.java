package com.mvipe.Recursion.Basic.BackTracking;

//Question - Given a maze , you can go right and down . you need to print all the possible paths
public class backtracking {

    public static void main(String[] args) {
        printingPath(3,3,"");
    }

    static void printingPath(int x,int y,String paths){
        if(x==1 && y==1){
            System.out.println(paths);
            return;
        }

        if(x==1){
            printingPath(x,y-1,paths+"D");
        }else if(y==1){
            printingPath(x-1,y,paths+"R");
        }else{
            printingPath(x,y-1,paths+"D");
            printingPath(x-1,y,paths+"R");
        }


    }
}
