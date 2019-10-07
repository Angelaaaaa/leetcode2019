package easy;

public class s1184 {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        distance= new int[]{7,10,1,12,11,14,5,0};
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int dis:distance){
            sum = sum+dis;
        }
        int sum1 = 0;
        if (start<destination) {
            for (int i = start; i < destination; i++) {
                sum1 = distance[i] + sum1;
            }
        }
        else {
            for (int i = start; i < distance.length; i++) {
                sum1 = distance[i] + sum1;
            }
            for (int i = 0; i < destination; i++) {
                sum1 = distance[i] + sum1;
            }
        }

        if (sum1 < sum - sum1){
            return sum1;
        }
        else {
            return sum-sum1;
        }
//        distanceBetweenBusStops
//        return 0;
    }
}
