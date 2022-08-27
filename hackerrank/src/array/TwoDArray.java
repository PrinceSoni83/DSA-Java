package array;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] multiDimArr = new int[6][6];
        for(int row = 0; row < 6 ; row++) {
            for(int col = 0; col < 6; col++){
                multiDimArr[row][col] = sc.nextInt();
            }
        }
        System.out.println(hourglassSumUsingArray(multiDimArr));
//        sc.close();
//        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> multiDimList = new ArrayList<>();
        for(int row = 0; row < 6 ; row++) {
            for(int col = 0; col < 6; col++){
                multiDimList.get(row).set(col,sc.nextInt());
            }
        }
        //sc.close();
        System.out.println(hourglassSumUsingList(multiDimList));
    }

    /*  Implementation using Array*/
    static int hourglassSumUsingArray(int[][] arr) {
        int max = Integer.MIN_VALUE;
        int total = 0;
        for(int row = 0; row<4; row++) {
            for(int col =0; col<4; col++) {
                total = arr[row][col] + arr[row][col+1] + arr[row][col+2];
                total += arr[row+1][col+1];
                total += arr[row+2][col] + arr[row+2][col+1] + arr[row+2][col+2];
                max = Math.max(total, max);
            }
        }
        return max;
    }

    /*  Implementation using ArrayList*/
     static int hourglassSumUsingList(ArrayList<ArrayList<Integer>> arr) {
        // Write your code here
        int max = Integer.MIN_VALUE;
        int total = 0;
        for(int row = 0; row<4; row++) {
            for(int col =0; col<4; col++){
                total  = arr.get(row).get(col) + arr.get(row).get(col+1) + arr.get(row).get(col+2);
                total += arr.get(row+1).get(col+1);
                total += arr.get(row+2).get(col) + arr.get(row+2).get(col+1) + arr.get(row+2).get(col+2);
                max = Math.max(total,max);
            }
        }
        return max;
    }

}