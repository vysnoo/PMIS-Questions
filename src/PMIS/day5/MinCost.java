package PMIS.day5;

public class MinCost {

    public static void main(String[] args) {
        System.out.println(minCost(new int[]{1,2,3}));   // 1
        System.out.println(minCost(new int[]{4,0,0,0})); // 3
        System.out.println(minCost(new int[]{2,2,1}));   // -1
    }
    public static long minCost(int[] machines) {
        int n = machines.length;

        long total = 0;
        for (int x : machines) total += x;

        if (total % n != 0) return -1;

        long avg = total / n;

        long cost = 0;
        for (int x : machines)
            if (x > avg)
                cost += x - avg;

        return cost;
    }
}
