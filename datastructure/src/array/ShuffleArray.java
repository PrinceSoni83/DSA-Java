package array;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(arr, n)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] output = new int[nums.length];
        int j = 0;
        for(int i = 0; i< n*2; i+=2){
            output[i] = nums[j];
            output[i+1] = nums[n+j];
            j++;
        }
        return output;
    }
}
