package Binary_Search;

public class searchinmount {

    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,3,2,1};
        int target=2;
        System.out.println(search(arr,target));
    }

    static int search (int[] arr, int target){
        int peak=peakIndexInMountainArray(arr);
        int firstTry=orderAgnosticBS(arr, target, 0, peak);
        if (firstTry!=-1){
            return firstTry;
        }
        return orderAgnosticBS(arr, target, peak-1, arr.length-1);
    }

    static int peakIndexInMountainArray(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return arr[start];
    }

    static int binarySearch(int[] arr, int target, int start, int end){

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            } else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        // int start = 0;
        // int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
