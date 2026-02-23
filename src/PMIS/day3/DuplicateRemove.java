package PMIS.day3;

import java.util.Arrays;

public class DuplicateRemove {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int i = 0;
        for(int num : nums){
            if(i<1 || num != nums[i-1]){
                nums[i++] = num;
            }
        }
        System.out.println(i+" ,");
        System.out.println(Arrays.toString(nums));
    }
}
