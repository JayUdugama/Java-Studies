import java.util.Arrays;
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i]=in.nextInt();

        }
        System.out.println(Arrays.toString(arr));
        swap(arr);
    }

    static void swap(int[] num){
        int temp =num[0];
        num[0] = num[1];
        num[1] = temp;

        System.out.println(Arrays.toString(num));

    }


}
