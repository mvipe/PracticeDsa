package com.mvipe.Recursion.Practice;
//Algo expert recursion
//phone number mnemonics

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneNumberMnemonics {
    static HashMap<String, String> map;

    public static void main(String[] args) {
        ArrayList<String> res=phoneNumberMnemonics("1905");
        System.out.println(res.toString());
    }

    static ArrayList<String> phoneNumberMnemonics(String phoneNumber) {
        // Write your code here.
         map = new HashMap<>();
        map.put("0","0");
        map.put("1","1");
        map.put("2","abc");
        map.put("3","def");
        map.put("4","ghi");
        map.put("5","jkl");
        map.put("6","mno");
        map.put("7","pqrs");
        map.put("8","tuv");
        map.put("9","wxyz");
        return phoneNumberMnemonics("",phoneNumber);
    }

    static ArrayList<String> phoneNumberMnemonics(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list =new ArrayList<>();
        String cur= String.valueOf(up.charAt(0));
        String curMnemonics=map.get(cur);

        for(int i=0;i<curMnemonics.length();i++){
            list.addAll(phoneNumberMnemonics(p+curMnemonics.charAt(i),up.substring(1)));
        }

        return list;

    }
}
