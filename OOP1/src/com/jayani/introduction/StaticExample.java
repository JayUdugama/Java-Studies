package com.jayani.introduction;

public class StaticExample {

    public static void main(String[] args) {

        Human jayani =new Human(25,"Jayani");
        Human hiruni =new Human(26,"Hiruni");

        System.out.println(Human.population+jayani.name);
        System.out.println(Human.population);




    }




}

class Human{

    int age;
    String name;
    static long population;

    public Human(int age,String name) {
        this.age = age;
        this.name = name;
        Human.population +=1;
    }




}
