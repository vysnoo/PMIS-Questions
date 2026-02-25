package PMIS.day11;

import java.util.HashMap;
import java.util.Map;

public class MinDistanceTwoEqElement {
    public static void main(String[] args) {
        int[] arr = {7,1,3,4,1,7};
        //int[] arr = {1,2,3,4};
        //int[] arr = {5,5,5,5};
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                min = Math.min(min,i-map.get(arr[i])+1);
            }
            map.put(arr[i],i);
        }
        if(min==Integer.MAX_VALUE){
            System.out.println(-1);
            return;
        }
        System.out.println(min);
    }
}
