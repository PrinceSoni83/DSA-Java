package array;

import java.util.Arrays;

public class RunningSumOfArray {

    public static void main(String[] args) {

        int[] input = {1,2,3,4,5};
        System.out.println(Arrays.toString(runningSum(input)));

    }

    public static int[] runningSum(int[] nums){
        int[] output = new int[nums.length];
        for(int i = 0; i< nums.length; i++){
            int sum = 0;
            for(int j=0; j<=i; j++) {
                sum = sum + nums[j];
            }
            System.out.println("sum : " + sum);
            output[i] = sum;
        }
        return output; ///[1, 3, 6, 10, 15]
    }
}
