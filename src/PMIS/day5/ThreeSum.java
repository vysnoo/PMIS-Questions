package PMIS.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> res  = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int s = i+1;
            int e = n-1;
            while(s<e){
                int sum = nums[i]+nums[s]+nums[e];
                if(sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[s], nums[e]));
                    s++;
                    e--;

                    while(s<e && nums[s]==nums[s-1]) s++;
                    while(s<e && nums[e]==nums[e+1]) e--;
                }else if(sum>0){
                    e--;
                }else{
                    s++;
                }
            }
        }
        System.out.println(res);
    }
}
