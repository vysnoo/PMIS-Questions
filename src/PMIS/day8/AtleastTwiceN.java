package PMIS.day8;

import java.util.HashSet;
import java.util.Set;

public class AtleastTwiceN {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        //int[] nums = {1,2,3,1};
        //int[] nums = {1,2,3,4};
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        int n = nums.length;
        for(int i=0;i<n;i++){
           if(!set.add(nums[i])){
               System.out.println(true);
               return;
           }
        }
        System.out.println(false);
    }
}
