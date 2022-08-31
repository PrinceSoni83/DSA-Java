package array;


/*
https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithGreatestCandies {
    public static void main(String[] args) {
        int[] input = {2,3,5,1,3};
        int n = 3;
        System.out.println(Arrays.toString(kidsWithCandies(input,n)));
    }

    public static boolean[] kidsWithCandies(int[] candies, int extraCandies) {
        int temp = 0;
        boolean[] output = new boolean[candies.length];
        List<Boolean> out = new ArrayList<>();
//        find the largest number in the array and then compare it with each element of array
        for( int i = 0; i< candies.length; i++) {
            if(temp < candies[i]) {
                temp = candies[i];
            }
        }
        for( int i = 0; i< candies.length; i++) {
            if((candies[i] + extraCandies) >= temp) {
                output[i] = true;
            } else {
                output[i] = false;
            }
        }
        return output;
    }
}
