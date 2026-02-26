package PMIS.day10;

public class EqualZeroAndOneSubstring {
    public static void main(String[] args) {
        String s = "0011";
        int n = s.length();
        int max = 0;

        for (int i = 0; i < n; i++) {
            // Only start from a '0'
            if (s.charAt(i) != '0') continue;

            int zeros = 0, ones = 0;
            int j = i;

            // Count consecutive 0s
            while (j < n && s.charAt(j) == '0') {
                zeros++;
                j++;
            }

            // Count consecutive 1s right after
            while (j < n && s.charAt(j) == '1') {
                ones++;
                j++;
            }

            // Valid only if zeros == ones
            if (zeros == ones) {
                max = Math.max(max, zeros + ones);
            }
        }

        System.out.println(max);
    }
}