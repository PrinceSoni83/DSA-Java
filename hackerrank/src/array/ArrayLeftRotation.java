package array;

import java.util.*;

public class ArrayLeftRotation {

    public static void main(String[] args) {
        int[] rotateThisArray = {1, 2, 3, 4, 5};
        List<Integer> rotateThisList = new ArrayList<Integer>() {
            {
                add(1);
                add(2);
                add(3);
                add(4);
                add(5);
            }
        };
        int numberOfLeftRotation = 6;
        int[] newArray = rotateAnArrayToTheLeft(rotateThisArray, numberOfLeftRotation);
        List<Integer> newList = rotateAListToTheLeft(rotateThisList, numberOfLeftRotation);
        System.out.println("The rotated array is : " + Arrays.toString(newArray));
        System.out.println("The rotated list is  : " + newList);

//        Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//        for(int k = 0; k < t; k++) {
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            int n = scanner.nextInt();
//            int temp = 0;
//            int j = 0;
//            for(int i = 0; i < n; i++) {
//                temp = (j * 2) + 1;
//                j = temp;
//                System.out.print(a + b * j + " ");
//            }
//        }
//        scanner.close();
    }

    /* Implement the solution using an Array*/
    public static int[] rotateAnArrayToTheLeft(int[] a, int d) {
        int size = a.length; // get the length of the initial array
        if (d > size) {
            System.out.println("Number of rotation should be less than the array size");
            return null;
        }
        int[] rotated_arr = new int[size]; // create a new empty array in which we will add the rotated elements
        int i = 0; // first element index
        int rotate_index = d; // d is like how many times we have to rotate the array
        // start with the rotated index till the size of the initial array
        while (rotate_index < size) {
            // put the rotated_index value from initial array into the ith index of new array
            rotated_arr[i] = a[rotate_index];
            i++;
            rotate_index++;
        }
        // initialize the rotation index to zero
        rotate_index = 0;
//         now run another loop till the given rotation number which is d
        while (rotate_index < d) {
            rotated_arr[i] = a[rotate_index];
            i++;
            rotate_index++;
        }
        return rotated_arr;
    }

    /* Implement the solution using a List*/

    public static List<Integer> rotateAListToTheLeft(List<Integer> a, int d) {
        int size = a.size();
        if (d > size) {
            System.out.println("Number of rotation should be less than the array size");
            return a;
        }
        List<Integer> rotated_list = new ArrayList<Integer>(size);
        int rotate_index = d;
        int i = 0;
        while (rotate_index < size) {
            rotated_list.add(i, a.get(rotate_index));
            i++;
            rotate_index++;
        }
        rotate_index = 0;

        while (rotate_index < d) {
            rotated_list.add(i, a.get(rotate_index));
            i++;
            rotate_index++;
        }
        return rotated_list;
    }

}
