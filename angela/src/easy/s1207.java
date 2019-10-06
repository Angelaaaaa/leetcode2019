package easy;

import java.util.HashMap;
//Given an array of integers arr, write a function that returns true if and only if the number of occurrences of each value in the array is unique.
public class s1207 {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length;i++){
            if(map.containsKey(arr[i])){
                int temp = map.get(arr[i]);
                temp++;
                map.put(arr[i],temp);
            }
            else {
                map.put(arr[i],1);
            }
        }
        HashMap<Integer,Integer> map1 = new HashMap<>();

        for(int i = 0; i < map.keySet().toArray().length; i++){
            if(map1.containsKey(map.get(map.keySet().toArray()[i]))){
               return false;
            }
            else {
                map1.put(map.get(map.keySet().toArray()[i]),1);
            }
        }

        return true;
    }
}
