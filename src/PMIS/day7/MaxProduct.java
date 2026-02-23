package PMIS.day7;

public class MaxProduct {
    public static int maxProduct(int[] arr) {

        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num : arr) {

            // Update largest values
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

            // Update smallest values
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        return Math.max(max1 * max2, min1 * min2);
    }

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{5, -10, -20, 3, 2})); // 200
        System.out.println(maxProduct(new int[]{1, 7, 3, 4}));        // 28
    }
}
