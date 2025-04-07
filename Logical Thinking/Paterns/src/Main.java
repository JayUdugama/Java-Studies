//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        printDiamond(3);
    }

    static void printDiamond(int n) {
        // Your code here
        for(int i=0;i<n;i++){

            for(int j=0;j<n-i-1;j++){

                System.out.print(" ");

            }

            for(int j=0;j<i+1;j++){

                System.out.print("*" +" ");

            }

            for(int j=0;j<n-i-1;j++){

                System.out.print(" ");

            }

            System.out.println();
        }

        for(int i=0;i<n;i++){

            for(int j=0;j<i;j++){

                System.out.print(" ");

            }

            for(int j=0;j<n-i;j++){

                System.out.print("*"+ " ");

            }

            for(int j=0;j<i;j++){

                System.out.print(" ");

            }

            System.out.println();
        }


    }


}

