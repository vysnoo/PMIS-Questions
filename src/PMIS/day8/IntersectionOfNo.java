package PMIS.day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfNo {
    public static void main(String[] args) {
         int[] nums1 = {4,9,5};
         int[] nums2 = {9,4,9,8,4};

//        int[] nums1 = {1,2,2,1};
//        int[] nums2 = {2,2};

       Map<Integer,Integer> map1 = new HashMap<>();
       Map<Integer,Integer> map2 = new HashMap<>();

       for(int n : nums1){
           map1.put(n, map1.getOrDefault(n,0)+1);
       }
        for(int n : nums2){
            map2.put(n, map2.getOrDefault(n,0)+1);
        }
        List<Integer> ans = new ArrayList<>();
        for(int n : map1.keySet()){
            if(map2.containsKey(n)){
                int min = (int)Math.min(map1.get(n), map2.get(n));
                for(int i=0;i<min;i++){
                    ans.add(n);
                }
            }
        }

        System.out.println(ans);
    }
}
