//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={-1,2,3,4,6,7,9,10,45,50};
        int tartget = 11;
        int answer = binarySearch(arr,tartget);
        System.out.println(answer);


    }
//return the index of the target element
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        //if mid value exceed the range of int then this will not work
        //int mid = (start + end)/2;So,
        //int mid = start+(end-start)/2;
        while (start<=end){
            int mid = start+(end-start)/2;

            if(target>arr[mid]){
                start=mid+1;

            } else if (target<arr[mid]) {
                end = mid-1;

            }else{
                return mid;
            }

        }

return -1;

    }

}