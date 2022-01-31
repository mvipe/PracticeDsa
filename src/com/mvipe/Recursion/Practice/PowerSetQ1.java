package com.mvipe.Recursion.Practice;

//Algo expert recursion question -powerset

import java.util.ArrayList;
import java.util.List;

public class PowerSetQ1 {
    public static void main(String[] args) {
        List<Integer> array=new ArrayList<>();
        array.add(1);
        array.add(2);
       // array.add(3);
        System.out.println(powerset(array).toString());
    }

    public static List<List<Integer>> powerset(List<Integer> array) {
        // Write your code here.
        List<Integer> p=new ArrayList<>();
        return powerset(p ,array);
    }

    static List<List<Integer>> powerset(List<Integer> p,List<Integer> up){

        //base case
        if(up.size()<=0) {
            List<List<Integer>> list=new ArrayList<>();
            list.add(p);
            return list;
        }


        int cur=up.get(0);

        List<Integer> newUp=new ArrayList<>();
        newUp.addAll(up);
        newUp.remove(0);

        //neglect
        List<List<Integer>> left=powerset(p,newUp);
        //accept
        List<Integer> newp=new ArrayList<>();
        newp.addAll(p);
        newp.add(cur);
        List<List<Integer>> right=powerset(newp,newUp);

        left.addAll(right);


        return left;
    }
}
