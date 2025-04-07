//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        boolean result = searchtarget3(arr,6);
        System.out.println(result);



    }

    //searching the index of the target value
    static int searchtarget(int[] num,int target){
        //if there ar no elements in the array
        if(num.length == 0){
            return -1;
        }
        //looping through the array
        for (int index = 0; index < num.length; index++) {
            int element = num[index];
            if(element == target){
                return index;
            }
            //return -1;


        }
        return -1;
    }

    static int searchtarget2(int[] num,int target){
        //if there ar no elements in the array
        if(num.length == 0){
            return Integer.MAX_VALUE;
        }
        //looping through the array
        for (int element : num) {

            if(element == target){
                return element;
            }
            //return -1;


        }
        return Integer.MAX_VALUE;
    }

    static boolean searchtarget3(int[] num,int target){
        //if there ar no elements in the array
        if(num.length == 0){
            return false;
        }
        //looping through the array
        for (int element : num) {

            if(element == target){
                return true;
            }
            //return -1;


        }
        return false;
    }
}