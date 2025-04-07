public class PatternOne {
    public static void main(String[] args) {
patern1(3);
pattern2(3);


    }

    static void patern1(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {

                System.out.print("*");
            }

            for (int j = 0; j < n - i - 1; j++) {

                System.out.print(" ");
            }

            System.out.println();
        }
    }
        static void pattern2(int a){

            for (int i = 0; i < a; i++) {

                for (int j = 0; j < i; j++) {

                    System.out.print(" ");

                }

                for (int j = 0; j < 2 * a - 2 * i - 1; j++) {

                    System.out.print("*");
                }

                for (int j = 0; j < i; j++) {

                    System.out.print(" ");

                }

                System.out.println();
            }

        }


        //Lower

    }


