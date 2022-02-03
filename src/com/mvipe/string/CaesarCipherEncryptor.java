package com.mvipe.string;
//algoexpert - string question
//Caesar Cipher Encryptor
public class CaesarCipherEncryptor {
    public static void main(String[] args) {
        System.out.println(caesarCypherEncryptor("xyz",2));

        System.out.println('x'+2);
    }

    static String caesarCypherEncryptor(String str, int key) {
        int k=key%26;
        // Write your code here.
        String newStr="";
        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i)+k>122){
                int il=str.charAt(i)+k-122;
                newStr+=(char)('a'+il-1);
            }
            else{
             newStr+=(char)(str.charAt(i)+k);
            }
        }
        return newStr;
    }
}
