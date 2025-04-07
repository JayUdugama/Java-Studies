import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Devisible {
    public static void main(String[] args) {
        ArrayList<Integer> arra = devisers();
        Collections.sort(arra);
        System.out.println(arra);

    }

    static ArrayList<Integer> devisers(){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                arr.add(i);
                if(num/i !=i){
                    arr.add(num/i);
                }
            }


        }

return arr;

    }


}
