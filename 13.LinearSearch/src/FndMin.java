public class FndMin {
    public static void main(String[] args) {
        int[] num = {56,78,-100,45,34,10,99,67,86,77};
        int minValue = min(num);
        System.out.println(minValue);

    }

    static int min(int[] arr){
        int min = arr[0];
        for (int index = 0;index < arr.length;index++) {
            if(arr[index]< min){
                min = arr[index];

            }


        }
return min;
    }
}
