package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements.
public class s1200 {
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> min =new ArrayList<List<Integer>>();
        int minDist = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i = 0;i < arr.length-1;i++){
//        for(int j = i; j < arr.length; j++)
            if(Math.abs(arr[i]-arr[i+1])<minDist){
                minDist = Math.abs(arr[i]-arr[i+1]);
                min  = new ArrayList<List<Integer>>();
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[i]);
                temp.add(arr[i+1]);
                min.add(temp);
            }
            else if(Math.abs(arr[i]-arr[i+1]) == minDist){
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[i]);
                temp.add(arr[i+1]);
                min.add(temp);
            }
        }
        return min;
    }

}
