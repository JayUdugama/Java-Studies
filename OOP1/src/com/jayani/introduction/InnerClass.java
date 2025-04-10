package com.jayani.introduction;

 public class InnerClass {

   static class New{

       static String Name;

       public New(String name) {
           New.Name = name;
       }
   }

     public static void main(String[] args) {
         New obj1 = new New("Jayani");
         New obj2 = new New("Hansani");

         System.out.println(obj1.Name);
         System.out.println(obj2.Name);
     }
}
