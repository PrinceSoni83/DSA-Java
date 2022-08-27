package array;

import java.util.*;

public class FirstAndLastSubstring {

    public static void main(String[] args) {
        String s = "welcometojava";
        int k = 3;
        int j = k;
        List<String> newList = new ArrayList<>();
        for (int i = 0 ; i <= s.length() -k; i++) {
            newList.add(s.substring(i,j));
            j++;
        }
        Collections.sort(newList);
        System.out.println(newList);
        System.out.println(newList.get(0));
        System.out.println(newList.get(newList.size()-1));
    }

}
