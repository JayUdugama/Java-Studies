public class RotationCount {
    public static void main(String[] args) {

        int[] arr = {2,3,4,5,6,7};
        int result = rotationCount(arr);
        System.out.println(result);

    }

    static int rotationCount(int[] arr){
        int pivot = findPivot(arr);

        return pivot+1;
    }

    static int findPivot(int[] arr){

        int n = arr.length;
        int start = 0;
        int end = n-1;

        while(start<=end){

            int mid = start + (end -start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }else if(mid>start && arr[mid-1]>arr[mid]){
                return mid-1;
            }else if(arr[mid]<=arr[start]){
                end = mid-1;
            }else{
                start =mid+1;
            }

        }

        return -1;
    }


}
