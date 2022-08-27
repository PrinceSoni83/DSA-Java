package strings;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "princeso";
        System.out.println("is the string has all unique characters? : " + isUniqueChars(str));

    }

    static boolean isUniqueChars(String str) {
        // if the string is ASCII then the length should be less than 128
        if (str.length() > 128) return false;

        // create an array of boolean values where the flag at index i indicates whether character i in the alphabet is contained in the string.
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length() ; i++) {
            int val = str.charAt(i);
            if(char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }

        return true;
    }

}
