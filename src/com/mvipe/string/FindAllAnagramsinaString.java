package com.mvipe.string;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsinaString {
    public static void main(String[] args) {
        System.out.println(findAnagrams("abab","ab").toString());

    }

    static List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new ArrayList<>();

        for (int i = 0; i <= s.length()-p.length(); i++) {
            String temp=s.substring(i,i+p.length());


            if(isAnagram(temp,p)){
                res.add(i);
            }
        }



        return res;

    }

    static boolean isAnagram(String a,String b){
        int a_length=a.length();
        int b_length=b.length();

        if(a_length!=b_length) return false;

        int[] char_frequencies=new int[26];

        for (int i = 0; i <a_length ; i++) {
            int index=a.charAt(i)-'a';
            char_frequencies[index]++;
        }

        for (int i = 0; i <b_length ; i++) {
            int index=b.charAt(i)-'a';
            char_frequencies[index]--;
        }

        for (int i = 0; i <26 ; i++) {
            if(char_frequencies[i]!=0) return false;

        }

        return true;
    }
}
