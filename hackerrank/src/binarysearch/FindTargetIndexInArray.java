package binarysearch;

public class FindTargetIndexInArray {

    public static void main(String[] args) {

        int[] arr = {-18,-12,-14,0,2,4,5,9,11,12,14,20,36,47};
        int target = 2;
        int index = findTargetIndex(arr,target);
        System.out.println(index);
    }

    private static int findTargetIndex(int[] arr, int target) {
        if( target == arr[0]) {
            return 0;
        }
        else if (target > arr[arr.length-1]) {
            return -1;
        }
        else {
            int start = 0;
            int i = 0;
            int end = arr.length-1;
            for (i = start; i<= end; i++) {
                int mid = start + (end - start)/2 ; // to avoid error in case of big number i.e. start+end
                if(target > arr[mid]) {
                    start = mid + 1;
                }else if (target < arr[mid]) {
                    end = mid -1;
                }else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
