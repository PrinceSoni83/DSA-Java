package strings;

import java.util.Scanner;

public class Anagrams {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        char firstCharA = a.charAt(0);
        char firstCharB = b.charAt(0);
        int count1 = 0;
        int count2 = 0;
        if (a.length() != b.length()) {
            System.out.println("Not Anagrams");
            return;
        }
        for(int i = 0; i< a.length(); i++){
            if(firstCharA == a.charAt(i)) {
                count1++;
            }
        }
        for(int j = 0; j< b.length(); j++){
            if(firstCharA == b.charAt(j)) {
                count2++;
            }
        }
        if (count1 == count2){
            System.out.println("Anagrams");
        }else {
            System.out.println("Not Anagrams");
        }

    }
}











