package PMIS.Day9;

import java.util.LinkedList;
import java.util.Queue;

public class ThreeSevenCount {
    public static long nextNumber(long N) {

        Queue<Long> queue = new LinkedList<>();

        queue.offer(3L);
        queue.offer(7L);

        while (!queue.isEmpty()) {

            long current = queue.poll();

            if (current > N) {
                return current;
            }

            queue.offer(current * 10 + 3);
            queue.offer(current * 10 + 7);
        }

        return -1;
    }

    public static void main(String[] args) {

        System.out.println(nextNumber(10));  // 33
        System.out.println(nextNumber(40));  // 73
        System.out.println(nextNumber(99));  // 333
    }
}
