package com.mvipe.string;
//https://leetcode.com/problems/find-the-difference/
//
public class FindTheDifference {
    public static void main(String[] args) {

    }

    static char findTheDifference(String s, String t) {
        int s_length=s.length();
        int t_length=t.length();



        int[] char_frequencies=new int[26];

        for (int i = 0; i <s_length ; i++) {
            int index=s.charAt(i)-'a';
            char_frequencies[index]++;
        }

        for (int i = 0; i <t_length ; i++) {
            int index=t.charAt(i)-'a';
            char_frequencies[index]--;
        }

        for (int i = 0; i <26 ; i++) {
            if(char_frequencies[i]!=0) return (char)(97+i);

        }

        return 'z';
    }
}
