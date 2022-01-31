package com.mvipe.Recursion.Basic;

import java.util.ArrayList;

public class SubSeq {

    public static void main(String[] args) {
        //printSubSeq("","abc");

//        ArrayList<String> result=retSubSeq("","abc");
//
//        System.out.println(result.toString());

       printSubSeqIter("abc");

    }

    
    static void printSubSeqIter(String up){

        ArrayList<String> list=new ArrayList<>();
        list.add("");

        for (int i = 0; i < up.length(); i++) {
            char ch=up.charAt(i);
            ArrayList<String> temp=new ArrayList<>();
            for(int j=0;j < list.size();j++){
                temp.add(list.get(j)+ch);
            }
            list.addAll(temp);
        }

        //print the subset
        System.out.println(list.toString());
    }

    static void printSubSeq(String p, String up) {
        //printing sub sequence when unprocessed string is empty
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }


        printSubSeq(p+up.charAt(0),up.substring(1));
        printSubSeq(p,up.substring(1));

    }

    static ArrayList<String> retSubSeq(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> left=retSubSeq(p+up.charAt(0),up.substring(1));
        ArrayList<String> right=retSubSeq(p,up.substring(1));

        left.addAll(right);
        return left;
    }


}
