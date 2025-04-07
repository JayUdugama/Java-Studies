//https://leetcode.com/problems/search-in-rotated-sorted-array/description/

public class RotatedBinarySearch {
    public static void main(String[] args) {

        int[] arr={4,4,5,6,7,0,1,2};
        int target = 5;
        int result = findTarget(arr,target);
        System.out.println(result);
    }

    static int findTarget(int[] arr, int target){

        int pivot = findPivot(arr);

        if(pivot == -1){
            return BinarySerch(arr,target,0,arr.length-1);
        }
        if(target == arr[pivot]){
            return pivot;
        }
        if(target>=arr[0]){
            return BinarySerch(arr,target,0,pivot-1);

        }else{
            return BinarySerch(arr,target,pivot+1,arr.length-1);
        }

    }

    static int findPivot(int[] arr){

        int n = arr.length;
        int start = 0;
        int end = n-1;

        while(start<=end){

            int mid = start + (end - start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){

                return mid;
            } else if (mid> start && arr[mid]<arr[mid-1]) {
                return mid-1;
            } else if (arr[start]<arr[mid]) {
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

        return -1;
    }

    static int findpivotInDuplicates(int[] arr){

        int n = arr.length;
        int start =0;
        int end =n;

        while(start<=end){
            int mid = start+(end - start)/2;

            if(mid<n && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid>0 && arr[mid]<arr[mid-1]){
                return mid-1;

            }
           else if(arr[mid]==arr[start] && arr[mid]==arr[end]){

                if(start>n && arr[start]>arr[start+1]){
                    return start;
                }
                start = start+1;
                if(end>0 && arr[end-1]>arr[end]){
                end = end-1;}
            }else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;

            }else{
                end = mid - 1;
            }
        }

        return -1;

    }

    static int BinarySerch(int[] arr,int target,int start,int end){

        while(start<=end){

            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]>target) {
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return -1;
    }
}
