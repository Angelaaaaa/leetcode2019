package easy;

public class s1154 {
    public int dayOfYear(String date) {
        int[] months_normal = new int[] { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] months_leap = new int[] { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String y = "";
        String m = "";
        String d = "";
        for(int i = 0; i < date.length();i++) {
            if (i < 4) {
                y = y + date.charAt(i);
            }
            if (i == 5 || i == 6) {
                m = m + date.charAt(i);
            }
            if (i == 8 || i == 9) {
                d = d + date.charAt(i);
            }
        }
       int year = Integer.valueOf(y);
       int month = Integer.valueOf(m);
       int day = Integer.valueOf(d);
       int[] months;
       if(year % 4 ==0){
           months=months_leap;
       }
       else {
           months = months_normal;
       }

       int sum = 0;
       for (int i = 0 ;i < month; i ++){
           sum = sum + months[i];
       }
        return sum+day;

    }
}
