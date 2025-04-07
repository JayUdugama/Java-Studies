public class SearchInRange {
    public static void main(String[] args) {
        int[] numArray = {1,2,3,45,6,7,8};
        boolean result = valueFromTheRange(numArray,1,6,8);
        System.out.println(result);

    }

    static boolean valueFromTheRange(int arr[],int start,int end,int target){

        for (int index = start; index <end ; index++) {
            if(arr.length == 0){
                return false;
            }
            if(arr[index] == target){
                return true;
            }


        }
        return  false;

    }
}
