package misc;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimalityTest {
    public static void main(String[] args) {
//        BigInteger a = new BigInteger("654561561356879113561");
//        boolean result = a.isProbablePrime(1);
//        if(result) {
//            System.out.println("prime");
//        }
//        else {
//            System.out.println("not prime");
//        }
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}

