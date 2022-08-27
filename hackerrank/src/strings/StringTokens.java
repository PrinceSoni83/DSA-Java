package strings;


import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class StringTokens {
    public static void main(String[] args) {
        String s = "He is a very very good boy, isn't he?";
//        String s = "";
        s = s.trim();
        if(s.length() > 0) {
            String[] strArr = s.split("[!,?._'@\\s]+");
            System.out.println(strArr.length);
            for (String a : strArr) {
                System.out.println(a);
            }
        }
        else {
            System.out.println(0);
        }

        String pattern = "[!,?._'@\\s]+";
        try {
            Pattern p = Pattern.compile(pattern);
            System.out.println("valid");
        }catch (PatternSyntaxException e) {
            System.out.println("invalid");
        }




    }
}
