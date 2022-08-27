package binarysearch;

public class CeilingAndFloor {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int ceilingTarget = 12;
        int floorTarget = 12;
        System.out.println(ceiling(arr,ceilingTarget));
        System.out.println(floor(arr,floorTarget));
    }

    // return the smallest number which is greater than or equal to target
    public static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        if(target > arr[arr.length-1]) return -1;
        while(start <= end) {
            int mid = start + (end -start)/2;
            if(target == arr[mid]) return arr[mid];
            if(target > arr[mid]) {
                start = mid+1;
            }else if (target < arr[mid]) {
                end = mid -1;
            }
        }
        return arr[start]; // because when while loop condition gets violated then start will be the number which is greater or equal to target.
    }

    // return the largest number which is smaller than or equal to target
    public static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        if(target < arr[0]) return -1;
        while(start <= end) {
            int mid = start + (end -start)/2;
            if(target == arr[mid]) return arr[mid];
            if(target > arr[mid]) {
                start = mid+1;
            }else if (target < arr[mid]) {
                end = mid -1;
            }
        }
        return arr[end]; // because when while loop condition gets violated then end will be the number which is lower or equal to target.
    }
}
