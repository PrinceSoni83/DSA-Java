package array;

//https://leetcode.com/problems/find-pivot-index/

public class FindPivot {
    public static void main(String[] args) {
        int[] input = {1,7,3,6,5,6};
        System.out.println("pivot is : " + pivotIndex(input));
    }

    static int pivotIndex(int[] nums) {
        int total_sum = 0;
        for(int i = 0; i<nums.length; i++) {
            total_sum += nums[i];
        }

        int left_sum = 0;
        for (int i = 0; i< nums.length ; i++){
            if (i != 0 ) {
                left_sum += nums[i-1];
            }
            if (total_sum - left_sum - nums[i] == left_sum){
                return i;
            }
        }
        return -1;
    }
}
