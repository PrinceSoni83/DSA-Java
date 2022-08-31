package array;

import java.util.Arrays;

/*https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/*/
public class SmallerNumbersThanCurrent {
    public static void main(String[] args) {
        int[] input = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(input)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int output[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    temp = temp + 1;
                }
            }
            output[i] = temp;
        }
        for (int i = nums.length - 1; i > 0; i--) {
            int temp = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] > nums[j]) {
                    temp = temp + 1;
                }
            }
            output[i] = output[i] + temp;
        }
        return output;
    }
}
