package PMIS.day10;

public class AllPath {
    public static void main(String[] args) {
        //int m = 3, n = 3;
        //int m = 2, n = 3;
        int m = 1, n = 4;
        System.out.println(uniquePaths(m,n));



    }
    static int[][] dp;

    static public int uniquePaths(int m, int n) {
        dp = new int[m+1][n+1];
        return solve(m, n);
    }

    static public int solve(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }

        if (dp[m][n] != 0) {
            return dp[m][n];
        }

        int left = solve(m - 1, n);
        int right = solve(m, n - 1);

        return dp[m][n] = left + right;
    }
}
