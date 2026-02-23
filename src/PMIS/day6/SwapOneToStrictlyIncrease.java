package PMIS.day6;

public class SwapOneToStrictlyIncrease {
    public static boolean canBeIncreasing(int[] arr) {
        int n = arr.length;

        // Step 1: find violation positions
        java.util.List<Integer> bad = new java.util.ArrayList<>();

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] >= arr[i + 1])
                bad.add(i);
        }

        // Case 1: already strictly increasing
        if (bad.size() == 0)
            return true;

        // Case 2: too many violations
        if (bad.size() > 2)
            return false;

        // Candidate indices to swap
        int i = bad.get(0);
        int j = (bad.size() == 2) ? bad.get(1) + 1 : i + 1;

        // Try swap
        swap(arr, i, j);
        if (isStrict(arr)) return true;

        // revert and try alternative
        swap(arr, i, j);
        swap(arr, i + 1, j);

        return isStrict(arr);
    }

    private static boolean isStrict(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] >= arr[i + 1])
                return false;
        return true;
    }

    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        System.out.println(canBeIncreasing(new int[]{1,3,2,4})); // true
        System.out.println(canBeIncreasing(new int[]{4,3,2,1})); // false
    }
}
