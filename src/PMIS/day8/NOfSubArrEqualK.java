package PMIS.day8;

import java.util.HashMap;
import java.util.Map;

public class NOfSubArrEqualK {
    public static void main(String[] args) {
        System.out.println(nOfSubArrEqualK(new int[]{1,1,1},2));
        System.out.println(nOfSubArrEqualK(new int[]{1,2,3},3));

    }

    static int nOfSubArrEqualK(int arr[],int k){
        int count =0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        int sum =0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            sum += arr[i];
            int sMinusK = sum-k;
            if(map.containsKey(sMinusK)){
                count += map.get(sMinusK);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;

    }
}
