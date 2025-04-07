import java.util.Scanner;

public class Week {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int num = in.nextInt();

        switch (num){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            default -> System.out.println("Enter valid day");
        }

    }
}
