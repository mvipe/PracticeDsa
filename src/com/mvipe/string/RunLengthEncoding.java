package com.mvipe.string;

public class RunLengthEncoding {
    public static void main(String[] args) {
        System.out.println(runLengthEncoding("AAAAAAAAAAAAABBCCCCDD"));
    }

    static String runLengthEncoding(String string) {
        int curCharCount=0;
        char curChar=string.charAt(0);
        StringBuilder encodedString= new StringBuilder();

        for(int i=0;i<string.length();i++){

            if(i==string.length()-1){
                if(string.charAt(i)==curChar && curCharCount<9 ){
                    curCharCount++;
                    encodedString.append(String.valueOf(curCharCount+"" + curChar));
                }else {
                    encodedString.append(String.valueOf(curCharCount+"" + curChar));
                    curCharCount=1;
                    curChar=string.charAt(i);
                    encodedString.append(String.valueOf(curCharCount+"" + curChar));
                }


            }
            else if(string.charAt(i)==curChar && curCharCount<9){
                curCharCount++;
            }
            else{
                encodedString.append(String.valueOf(curCharCount+"" + curChar));
                curCharCount=1;
                curChar=string.charAt(i);
            }
            System.out.println();
        }
        return encodedString.toString();
    }
}
