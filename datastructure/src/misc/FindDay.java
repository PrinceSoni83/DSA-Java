package misc;

import java.util.Calendar;

public class FindDay {
    public static void main(String[] args) {
        int month = 8;
        int day = 5;
        int year = 2015;
        System.out.println(findDay(month, day, year));
    }

    public static String findDay(int month, int day, int year) {
        String[] strDay = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        Calendar c = Calendar.getInstance();
        c.set(year, month-1, day);
        return strDay[(c.get(Calendar.DAY_OF_WEEK))-1];

    }

}
