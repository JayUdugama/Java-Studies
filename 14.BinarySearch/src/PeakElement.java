//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class PeakElement {

    public static void main(String[] args) {

        int[] arr = {0,2,1,0};
        System.out.println(anotherMeth(arr));


    }

    static int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;

            }

        }

        return start;

    }


    //Using linear search algorithm.But not recommended for this scenario
//    static int selectPeakElement(int[] arr) {
//
//        for (int i = 0; i < arr.length; i++) {
//
//            if ((i == 0 || arr[i] > arr[i - 1]) && (i == arr.length - 1 || arr[i] > arr[i + 1])) {
//
//                return arr[i];
//
//            }
//
//        }
//        return -1;
//
//
//    }


    static int anotherMeth(int[] arr) {
        int n = arr.length;
        int start =0;
        int end = n-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(n==1){
                return arr[0];
            }
            if(arr[0]>arr[1]){
                return arr[0];

            }
            if(arr[n-1]>arr[n-2]){
                return arr[n-1];
            }
            //int mid = start + (end-start)/2;
            if(arr[mid-1] < arr[mid] && arr[mid]>arr[mid+1]){

                return arr[mid];
            }else if(arr[mid+1]>arr[mid]){
                start =mid+1;

            }else if(arr[mid+1]<arr[mid]){
                end = mid;
            }
        }

        return -1;

    }

}


