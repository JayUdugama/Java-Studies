package com.jayani;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);
        int number = inputNumber.nextInt();
        for(int i=1;i<=10;i++){
            System.out.printf("%d * %d = %d%n" , number,i,number*i);
        }
    }
}
