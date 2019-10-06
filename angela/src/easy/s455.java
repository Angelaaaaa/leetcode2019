package easy;

import java.util.Arrays;
//Children and biscuits
public class s455 {
    public static int findContentChildren(int[] g, int[] s) {
        int counter = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        while (i < g.length && j < s.length){
            if(g[i] <= s[j]) {
                i++;
                j++;
                counter++;
            }
            else {
                j++;
            }
        }
        System.out.print(counter);
        return counter;
    }

}
