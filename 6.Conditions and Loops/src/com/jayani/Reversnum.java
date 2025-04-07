package com.jayani;

public class Reversnum {
    public static void main(String[] args) {
        int num = 234556;
        int answer =0;

        while(num>0){


            int remain = num%10;
            num = num/10;
            answer = answer*10 + remain;




        }
        System.out.println(answer);
    }
}
