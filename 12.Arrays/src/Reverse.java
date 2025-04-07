import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rev(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void rev(int[] num){
        int start = 0;
        int end = num.length-1;
        while(start<end){
            swap(num,start,end);
            start++;
            end--;

        }


    }
    static void swap(int[] num,int indx1,int indx2){
        int temp = num[indx1];
        num[indx1] = num[indx2];
        num[indx2] = temp;


    }
}
