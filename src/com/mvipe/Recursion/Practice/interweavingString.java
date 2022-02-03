package com.mvipe.Recursion.Practice;

public class interweavingString {
    public static void main(String[] args) {
        System.out.println(interweavingStrings("algoexpert","your-dream-job","your-algodream-expertjob"));
        //System.out.println(interweavingStrings("abc","123","a1b2c3"));
        System.out.println("your-algodream-expert-job".charAt(21));
    }


    static boolean interweavingStrings(String one, String two, String three) {
        int index_one=0;
        int index_two=0;
        int index_three=0;

        while(index_three<three.length()){
            if((index_one<one.length() && index_two<two.length()) && (three.charAt(index_three)==one.charAt(index_one))
            && (three.charAt(index_three)==two.charAt(index_two))){
                if((index_one+1<one.length()) && (three.charAt(index_three+1)==(one.charAt(index_one+1)) )){
                    index_three++;
                    index_one++;
                }else if((index_two+1<two.length()) && (three.charAt(index_three+1)==(two.charAt(index_two+1)) )){
                    index_three++;
                    index_two++;
                }else{
                    return false;
                }
            }
            else if(index_one<one.length() && (three.charAt(index_three)==(one.charAt(index_one))) ){
                index_three++;
                index_one++;
            }else if(index_two<two.length() &&(three.charAt(index_three)==(two.charAt(index_two)))){
                index_three++;
                index_two++;
            }else{
                return false;
            }
        }
        return true;
    }


}
