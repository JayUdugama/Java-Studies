public class FloorofNumber {
    public static void main(String[] args) {
        int[] arr = {5,10,24,30,40};
        int target =4;
        int ans=floorofNumber(arr,target);
        System.out.println(ans);


    }
    static int floorofNumber(int[] arr,int target){
        if (target<arr[0]){
            return -1;

        }
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

        return arr[end];


    }
}
