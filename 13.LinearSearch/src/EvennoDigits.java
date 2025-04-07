public class EvennoDigits {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        int result = findNumbers(arr);
        //System.out.println(result);
        //System.out.println(digits2(-567789));
        System.out.println(digits(1));


    }
    static int findNumbers(int[] nums) {
        int count =0;
        for(int element : nums){
            if(even(element)){
                count = count + 1;
            }

        }
        return count;

    }
    static boolean even(int num){
        if(digits(num)%2==0){
            return true;
        }
        return false;

    }
    //finding no.of digits in a number in optimized way
    static int digits2(int num){
        if(num<0){
            num = num*-1;
        }
        return (int)(Math.log10(num)) + 1;

    }
     static int digits(int num) {
         int count =0;
        if(num<0){
            num = num * -1;
        }
//        if(num==1){
//            return 1;
//        }

        while(num>0){
            count++;
            num = num/10;

        }

        return count;
    }
}
