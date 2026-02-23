package PMIS.day5;

public class PatternHard {
    public static void main(String[] args) {
        int n = 4;

        for(int row = 1;row <= n;row++) {
            for(int col = 1; col<=n;col++) {
                int top = row;
                int left = col;
                int bottom = n - row + 1;
                int right = n - col + 1;

                int value = Math.min(Math.min(top, bottom),
                        Math.min(left, right));

                System.out.print(n-value+1 + " ");
            }
            System.out.println();
        }
    }
}
