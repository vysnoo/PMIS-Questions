package PMIS.day1;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        ;
        System.out.println(Arrays.toString(productExceptSelf(arr)));


    }


    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] lp = new int[n];
        int[] rp = new int[n];

        lp[0] = 1;
        for (int i = 1; i < n; i++) {
            lp[i] = nums[i - 1] * lp[i - 1];
        }
        rp[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            rp[i] = nums[i + 1] * rp[i + 1];
        }

        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = lp[i] * rp[i];
        }
        return res;

    }
}

