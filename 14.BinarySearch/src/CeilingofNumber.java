public class CeilingofNumber {
    public static void main(String[] args) {
        int[] arr = {1,10,24,30,40};
        int target =45;
        int ans = ceilingofNumber(arr,target);
        System.out.println(ans);


    }

    static int ceilingofNumber(int[] arr,int target){
        if(target>arr[arr.length-1]){
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

        return arr[start];


    }
}
