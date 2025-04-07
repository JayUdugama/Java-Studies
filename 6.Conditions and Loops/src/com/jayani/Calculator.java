package com.jayani;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int answer = 0;

        while (true){
            System.out.println("Enter the operator:");
            char op = in.next().trim().charAt(0);

            if(op == 'x'|| op=='X'){
                System.out.println("Exiting");
                break;
            }

            if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%') {
                System.out.print("Enter two numbers:");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+') {
                    answer = num1 + num2;
                }
                if (op == '-') {
                    answer = num1 - num2;
                }
                if (op == '*') {
                    answer = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        answer = num1 / num2;
                    } else {
                        System.out.println("Error: Numerator is zero");
                    }
                }


            }else{
                System.out.println("invalid operation");
            }
            System.out.println(answer);
            
        }
        //System.out.println(answer);
    }
}
