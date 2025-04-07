package com.jayani.introduction;


public class Main {
    public static void main(String[] args) {

        Student sd1 = new Student("Jay",14,67.5f);

        System.out.println(sd1.name + " " + sd1.rollNo + " " + sd1.marks);


        Student sd2 = new Student(sd1);
        System.out.println(sd2.name);

        Student sd3 = new Student();
        System.out.println(sd3.name);


    }

}
class Student{

    String name;
    int rollNo;
    float marks;

    Student(){
        this("Jay",45,78.6f);

    }

    Student(String name,int rollNo,float marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;

    }

    Student(Student other){
        this.name = other.name;
        this.rollNo = other.rollNo;
        this.marks = other.marks;

    }
   public void writing(){

    }

    void reading(){

    }



}