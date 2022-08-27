package binarysearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr1 = {-18,-12,-14,0,2,4,5,9,11,12,14,20,36,47};
        int[] arr2 = {47,45,41,39,35,25,21,19,11,3,0,-1,-3,-7};
        System.out.println(orderAgnosticBS(arr1,11));
        System.out.println(orderAgnosticBS(arr2,39));
    }

    /* find the target number's index in an ascending or descending ordered sorted array*/
    public static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;
        boolean isAsc = arr[start] < arr[end];
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(arr[mid] == target) {
                return mid;
            }
            if(isAsc) {
                if(target > arr[mid] ) {
                    start = mid + 1;
                }else {
                    end  = mid -1;
                }
            }else {
                if(target < arr[mid] ) {
                    start = mid + 1;
                } else {
                    end  = mid -1;
                }
            }
        }
        return -1;
    }
}
