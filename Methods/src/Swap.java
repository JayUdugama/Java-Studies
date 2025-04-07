public class Swap {
    public static void main(String[] args) {

        int a =10;
        int b = 20;

        //swap two numbers
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println(a + " " + b);
        swap(a,b);
        System.out.println(a + " " + b);
    }

    static void swap(int num1,int num2){
        //System.out.println("Before swapping "+ num1 + " "+ num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        //System.out.println(num1 + " " + num2);


    }
}
