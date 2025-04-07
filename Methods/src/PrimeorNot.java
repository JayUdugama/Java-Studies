import java.util.Scanner;

public class PrimeorNot {
    public static void main(String[] args) {
    pornot();

    }

    static void pornot(){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = 0;

        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                count=count+1;
                if(num/i != i  ){
                    count =count+1;
                }
            }

        }
        if(count==2){
            System.out.println("prime Number");
        }else{
            System.out.println("Not Prime Number");
        }
    }
}
