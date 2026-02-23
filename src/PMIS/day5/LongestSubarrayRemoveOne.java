package PMIS.day5;

public class LongestSubarrayRemoveOne {
    public static void main(String[] args) {

        int[] nums = {0,1,1,1,0,1,1,0,1};

        System.out.println(longestSubarray(nums));

    }
    static public int longestSubarray(int[] nums) {
        int res = 0;

        for (int i = 0; i < nums.length; i++) {

            int count = 0;

            for (int j = 0; j < nums.length; j++) {

                if (j == i) continue;

                if (nums[j] == 1) {
                    count++;
                } else {
                    count = 0;
                }

                res = Math.max(res, count);
            }
        }

        return res;
    }
}
