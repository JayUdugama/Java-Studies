import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        max(arr);
    }

    static void max(int[] num){
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if(num[i]>max){
                max = num[i];
            }

        }
        System.out.println(max);

    }
}
