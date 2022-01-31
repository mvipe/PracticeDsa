package com.mvipe.Recursion.Practice;
//skipping a character

public class SkipACharacter {
    public static void main(String[] args) {
        System.out.println(skipReturn("bccad"));
    }

    static void skip(String p,String up){
        //printing the processed string when unprocessed string will be empty
        if(up.equals("")){
            System.out.println(p);
            return;
        }

        if(up.charAt(0)=='a'){
            skip(p,up.substring(1));
        }else{
            skip(p+up.charAt(0),up.substring(1));
        }

    }

    static String skipReturn(String up){
        //returning the processed string when unprocessed string will be empty
        if(up.equals("")) return "";

        if(up.charAt(0)=='a') return skipReturn(up.substring(1));
        else return up.charAt(0)+skipReturn(up.substring(1));
    }
}
