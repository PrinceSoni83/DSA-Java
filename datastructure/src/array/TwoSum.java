package array;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] input = {3,2,4};
        System.out.println(Arrays.toString(twosum(input,6)));
    }

    static int[] twosum(int[] arr, int target){
        int[] output = new int[2];
        int start = 0;
        int end = arr.length-1;
        int mid = (start + end) / 2;
        if (target < arr[mid]) {
            end = mid;
        } else if (target > arr[mid]) {
            start = mid-1;
        }
        for(int i = start; i<= end; i++) {
            if (arr[i] + arr[i+1] == target){
                output[0] = i;
                output[1] = i+1;
                break;
            }
        }
        return output;
    }
}


