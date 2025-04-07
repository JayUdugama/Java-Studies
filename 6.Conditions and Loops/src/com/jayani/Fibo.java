package com.jayani;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int a = 0;
        int b = 1;
        int temp=0;
        System.out.println(a);
        System.out.println(b);
        //int count = 2;
        for (int i = 2; i <=num ; i++) {

            temp = a+b;
            a = b;
            b = temp;
            System.out.println(temp);

        }
       // System.out.println(temp);
    }
}
