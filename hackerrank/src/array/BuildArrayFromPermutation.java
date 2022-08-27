package array;
import java.util.Arrays;


// Leetcode problem : easy
public class BuildArrayFromPermutation {

    public static void main(String[] args) {
        BuildArrayFromPermutation buildArrayFromPermutation = new BuildArrayFromPermutation();
        int[] input = {5,0,1,2,3,4};
        System.out.println(Arrays.toString(buildArrayFromPermutation.buildArray(input)));
    }

    public int[] buildArray(int[] nums) {
        int[] arrDistinct = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            arrDistinct[i] = nums[num];
        }
        return arrDistinct;
    }
}
