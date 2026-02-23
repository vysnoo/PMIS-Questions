package PMIS.day6;

public class FileSizeMerge {
    public static int minCost(int[] arr, int i, int j) {

        // only one file → no cost
        if (i == j)
            return 0;

        int min = Integer.MAX_VALUE;

        // try all possible last merges
        for (int k = i; k < j; k++) {

            int leftCost  = minCost(arr, i, k);
            int rightCost = minCost(arr, k + 1, j);

            int mergeCost = sum(arr, i, j);


            int total = leftCost + rightCost + mergeCost;
            System.out.println(total);

            min = Math.min(min, total);
        }

        return min;
    }

    // simple sum function (easy to understand)
    static int sum(int[] arr, int i, int j) {
        int s = 0;
        for (int k = i; k <= j; k++)
            s += arr[k];
        return s;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,6};
        System.out.println(minCost(arr, 0, arr.length - 1)); // 29
    }
}
