import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
       int answer = sum();
        System.out.println(answer);

    }

    static int sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no.1:");
        int num1 = in.nextInt();

        System.out.println("Enter no.2:");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;



    }
}

