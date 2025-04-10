package com.jayani.introduction;

public class StaticBlock {

    static int a=3;
    static int b;

    static{

        System.out.println("Hello I am static block");
    }

    public static void main(String[] args) {
        StaticBlock obj1 = new StaticBlock();
        obj1.b=24;
        System.out.println(b);
    }


}
