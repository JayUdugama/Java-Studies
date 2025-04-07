package com.jayani;

public class Main{
    public static void main(String[] args) {

        int salary = 25000;

        if(salary > 10000){
            salary += 1000;
        }else if(salary > 20000){
            salary += 2000;
        }else{
            salary += 500;
        }
        System.out.println(salary);


    }
}