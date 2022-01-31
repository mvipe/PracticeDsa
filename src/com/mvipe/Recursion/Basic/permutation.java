package com.mvipe.Recursion.Basic;

import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
        //permutation("","abc");
        ArrayList<String> result=permutationRet("","abc");
        System.out.println(result.toString());
        System.out.println(permutationCount("","abcd"));
    }


    //printing permutations
    static void permutation(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch=up.charAt(0);

        for (int i = 0; i <=p.length() ; i++) {
            String newP=p.substring(0,i)+ch+p.substring(i);
            permutation(newP,up.substring(1));
        }
    }


    //returning an arrayList
    static ArrayList<String> permutationRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch=up.charAt(0);


        ArrayList<String> list=new ArrayList<>();
        for (int i = 0; i <=p.length() ; i++) {
            String newP=p.substring(0,i)+ch+p.substring(i);
            ArrayList<String> temp= permutationRet(newP,up.substring(1));
            list.addAll(temp);
        }

        return list;
    }


    //returning  permutations count
    static int permutationCount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }

        char ch=up.charAt(0);

        int count=0;
        for (int i = 0; i <=p.length() ; i++) {
            String newP=p.substring(0,i)+ch+p.substring(i);
            count+=permutationCount(newP,up.substring(1));
        }

        return count;
    }


}
