import java.util.Arrays;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i=0;i<arr.length;i++){
            Scanner in = new Scanner(System.in);
            arr[i] = in.nextInt();
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }

    }
}
