package misc;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter any number to be checked for prime :  ");
        int n = sc.nextInt();
        System.out.println(n + " is prime number? : " + isPrime(n));
    }

    static boolean isPrime(int num) {
        int i = 2;
        boolean flag = true;
        while (i < num/2){
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return flag;
    }
}
