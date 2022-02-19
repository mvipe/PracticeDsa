package com.mvipe.Search;

public class guessANumber {
    public static void main(String[] args) {
        System.out.println(guessNumber(10,6));
    }

    static int guessNumber(int n,int pick) {
        int max=n;
        int min=0;
        while(min<=max){
            int gues= (int)(Math.random()*(max-min+1)+min);
            int status=guess(gues,pick);

            if(status==0) return gues;
            if(status==1) {
                min=gues+1;
            }else{

                max=gues-1;
            }
        }

        return min;


    }

    static int guess(int n,int pick){
        if(n==pick) return 0;
        else if (n>pick) return 1;
        else return -1;

    }
}
