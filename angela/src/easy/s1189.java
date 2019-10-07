package easy;

import java.util.HashMap;

public class s1189 {
    public static int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        String str = "balon";
        for(Character c:text.toCharArray()){
            if(c == 'b' || c == 'a' || c == 'l' || c =='o' || c =='n') {
                int temp = map.getOrDefault(c, 0);
                temp++;
                map.put(c, temp);
            }
        }
        map.put('l',map.getOrDefault('l',0)/2);
        map.put('o',map.getOrDefault('o',0)/2);
        int min = Integer.MAX_VALUE;
        for(Character key: str.toCharArray()){
            System.out.print(map.getOrDefault(key,0));
            if (min > map.getOrDefault(key,0)){
                min =  map.getOrDefault(key,0);
            }

        }
        System.out.print(min);
        return min;
    }
}
