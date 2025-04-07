import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        //System.out.println(Greeting());
        Scanner in = new Scanner(System.in);
        String name = in.next();

        String message = greeting1(name);
        System.out.println(message);


    }

    private static String greeting1(String name) {

        String newMessage = "Hello "+ name;
        return newMessage;
    }

    static String Greeting(){
        String in = "Hello how are you?";
        return in;
    }




}
