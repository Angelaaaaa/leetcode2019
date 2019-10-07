package easy;

import java.util.Arrays;

public class s1185 {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] date = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday","Sunday"};
        int d = day;
        int m = month;
        int y = year;
        int C = (year - year % 100)/100;
        System.out.print(date[C/4-2*C+y+y/4+26*(m+1)/10+d-1]);
        return date[C/4-2*C+y+y/4+26*(m+1)/10+d-1];

    }
}
