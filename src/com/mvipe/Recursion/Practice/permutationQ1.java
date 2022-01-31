package com.mvipe.Recursion.Practice;

//source - ALgoExpert
/*
Question Details - Permutation QUestion
    write a function that takes in an array of unique integers
    and returns an array of all permutations of those integers
    in no particular order


 */

import java.util.ArrayList;
import java.util.List;

public class permutationQ1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);

        System.out.println(getPermutations(new ArrayList<>(),list).toString());



    }

    static List<List<Integer>> getPermutations(ArrayList<Integer> p,ArrayList<Integer> up) {
        // Write your code here.
        if(up.size()<=0){
            ArrayList<List<Integer>> list=new ArrayList<List<Integer>>();
            if(p.size()<=0){
                return list;
            }

            list.add(p);
            return list;
        }

        int ind=up.get(0);

        ArrayList<List<Integer>> res=new ArrayList<List<Integer>>();
        for (int i = 0; i <=p.size() ; i++) {
            //new unprocessed array
            ArrayList<Integer> newUp=new ArrayList<>();
            newUp.addAll(up);
            newUp.remove(0);

            //new processed array

            ArrayList<Integer> temp=new ArrayList<>();
            temp.addAll(p);

            temp.add(i,ind);
            res.addAll(getPermutations(temp,newUp));


        }

        return res;
    }
}
