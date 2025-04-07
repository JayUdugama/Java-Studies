import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//        boolean result = val(num);
//        System.out.println(result);
        allArmastrong();
    }

    static void allArmastrong(){
        for(int i=100;i<1000;i++){
            if(val(i)){
                System.out.println(i);
            }
        }
    }

    static boolean val(int n){
        int original = n;
        int sum = 0;
        while(n>0){

            int remain = n%10;
            sum = sum + remain*remain*remain;
            n=n/10;

        }
        return sum == original;

    }
}