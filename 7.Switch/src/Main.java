import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();


        switch (fruit) {
            case "Mango" -> System.out.println("This is the main fruit");
            case "Apple" -> System.out.println("This is a sweet fruit");
            case "Orange" -> System.out.println("This is a acidic fruit");
            default -> System.out.println("Enter a valid fruit");
        }

    }
}