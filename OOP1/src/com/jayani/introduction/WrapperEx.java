package com.jayani.introduction;

public class WrapperEx {

    public static void main(String[] args) {

        final A obj1 = new A("Jayani");
        obj1.name = "Hansani";

         A obj=new A("Nimal");

        System.out.println(obj);

//        for(int i=0;i<1000000;i++){
//            new A("Han");
//        }

    }
}

class A{
    final int input = 12;
    String name;

    A(String name){
        this.name = name;

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("objects are removed from the memory");
    }
}
