package com.mvipe.Recursion.Basic.BackTracking;

import java.util.ArrayList;

//Maze Problem
public class Maze {
    public static void main(String[] args) {
//        System.out.println(""+count(3,3));
//        printingPath(3,3,"");
//        System.out.println(returningPath(3,3,"").toString());

        printingDiagonally(3,3,"");
    }

    static int count(int r,int c){
        if(r==1 || c==1){
            return 1;
        }

        int left=count(r-1,c);
        int right=count(r,c-1);

        return left+right;
    }

    static void printingPath(int r,int c,String paths){
        if(r==1 && c==1){
            System.out.println(paths);
            return;
        }

        if(r>1){
            printingPath(r-1,c,paths+"D");
        }
        if(c>1){
            printingPath(r,c-1,paths+"R");
        }


    }

    static ArrayList<String> returningPath(int r, int c, String paths){
        if(r==1 && c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(paths);

            return list;
        }
        ArrayList<String> res=new ArrayList<>();
        if(r>1){
            res.addAll(returningPath(r-1,c,paths+"D"));
        }
        if(c>1){
            res.addAll(returningPath(r,c-1,paths+"R"));
        }

        return res;

    }

    static void printingDiagonally(int r,int c,String paths){
        if(r==1 && c==1){
            System.out.println(paths);
            return;
        }

        if(r>1 && c>1){
            printingDiagonally(r-1,c-1,paths+"x");
        }
        if(r>1){
            printingDiagonally(r-1,c,paths+"D");
        }
        if(c>1){
            printingDiagonally(r,c-1,paths+"R");
        }


    }
}
