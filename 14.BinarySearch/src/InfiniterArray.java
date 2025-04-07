public class InfiniterArray {
    public static void main(String[] args) {
        int[] arr={12,13,20,24,25,26,35,37,38,39,40,45,46,47,48};
        int target = 35;
        System.out.println(result(arr,target));

    }
    //to find the result
    static int result(int[] arr,int target){

        int start =0;
        int end=1;

        while(target>arr[end]){

            int newStart = end+1;
            end=end+(end-start+1)*2;
            start=newStart;

        }

        return binarySearch(arr,target,start,end);

    }

    static int binarySearch(int[] arr,int target,int start,int end){

        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;

            } else if (target>arr[mid]) {
                start = mid+1;

            }else{
                return mid;
            }

        }
        return -1;
    }
}
