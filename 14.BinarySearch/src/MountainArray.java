public class MountainArray {

    public static void main(String[] args) {

        int[] arr = {1,2,4,10,7,6,5,3};
        int target = 3;
        int result = searchTarget(arr,target);
        System.out.println(result);

    }

    static int searchTarget(int[] arr,int target){
         int peak = peakElement(arr);
         int ascPartTry = orderAgnosticBs(arr,target,0,peak);
         if(ascPartTry!=-1){
             return ascPartTry;
         }
         return orderAgnosticBs(arr,target,peak,arr.length-1);


    }


    static int orderAgnosticBs(int[] arr,int target,int start,int end){

        boolean isAcs = arr[start]<arr[end];


        while (start<=end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isAcs){
                if (target<arr[mid]){
                    end=mid-1;

                }else {
                    start =mid+1;
                }

            }else{
                if (target<arr[mid]){
                    start=mid+1;

                }else {
                    end =mid-1;
                }

            }


        }
        return -1;


    }

    static int peakElement(int[] arr){

        int start =0;
        int end = arr.length-1;

        while(start<end){
            int mid = start+(end-start)/2;

            if(arr[mid]>arr[mid+1]){
                end = mid;

            }else{
                start = mid+1;
            }
        }
        return start;
    }
}
