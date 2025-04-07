import java.util.Arrays;

public class TwoDSearch {
    public static void main(String[] args) {
        int[][] twoD = {{1,2,3,4},{5,6,44,1,67},{200,56,78,56,24}};
        int[] result = search(twoD,1);
        //System.out.println(Arrays.toString(result));
        //System.out.println(searchMax(twoD));
        System.out.println(max(twoD));


    }

    static int[] search(int[][] arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){

                    return new int[]{row, col};

                }

            }

        }
return new int[]{-1,-1};
    }

    //Maximum in 2D Array
//    static int searchMax(int[][] arr){
//        int max = arr[0][0];
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if(arr[row][col] > max){
//
//                    max = arr[row][col];
//
//                }
//
//            }
//
//        }
//        return max;
//    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int row[] : arr){
            for(int element : row){
                if(element > max)

                    max = element;

            }

        }
        return max;

    }
}
