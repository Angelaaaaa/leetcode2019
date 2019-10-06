package easy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

//Given scores of N athletes,
// find their relative ranks and the people with the top three highest scores,
// who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".
public class s506 {
    public static String[] findRelativeRanks(int[] nums) {
        int[] temp = nums.clone();
        Arrays.sort(temp);
        HashMap<Integer,Integer> rank  = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i ++){
            rank.put(temp[i],nums.length-1-i);
        }
        String s[] = new String[nums.length];

        for(int i = 0; i < nums.length; i ++){
            s[i] = String.valueOf(rank.get(nums[i])+1);
        }

        for(int i = 0; i < nums.length; i ++) {
            if (s[i].compareTo("1") == 0) {
                s[i] = "Gold Medal";
            }

            if (s[i].compareTo("2") == 0) {
                s[i] = "Silver Medal";
            }
            if (s[i].compareTo("3") == 0) {
                s[i] = "Bronze Medal";
            }
        }
        System.out.print(s[0]);
        return s;

    }
}