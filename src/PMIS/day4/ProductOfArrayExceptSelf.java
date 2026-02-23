package PMIS.day4;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[]  nums = {1,2,3,4};
        int n = nums.length;
        int[] lp = new  int[n];
        lp[0]= 1;
        for(int i=1;i<n;i++){
            lp[i] = nums[i-1] * lp[i-1];
        }
        int rp = 1;
        for(int i=n-1;i>=0;i--){
            lp[i] = lp[i] * rp;
            rp = rp* nums[i];
        }
        System.out.println(Arrays.toString(lp));
    }
}
