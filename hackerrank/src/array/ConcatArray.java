package array;


import java.util.Arrays;

// leetcode
public class ConcatArray {

    public static void main(String[] args) {

        int[] input = {1,2,3,4};
        System.out.println(Arrays.toString(getConcatenation(input)));

    }

    public static int[] getConcatenation(int[] nums){
        int n = nums.length;
        int[] ans = new int[n * 2];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }

        return ans;
    }
}
