package PMIS.Day9;

import java.util.ArrayList;
import java.util.List;

public class LuckyNoInMatrix {
    public static void main(String[] args) {
        int[][] arr1 = {{3, 7, 8}, {9, 11, 13}, {15, 16, 17}};
        int[][] arr2 = {{1,2}, {3,4}};
        LuckyNoInMatrix obj = new LuckyNoInMatrix();
        System.out.println(obj.luckyNumbers(arr1));
        System.out.println(obj.luckyNumbers(arr2));

    }
    public int luckyNumbers(int[][] matrix) {
        int N = matrix.length, M = matrix[0].length;
        List<Integer> rowMin = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int rMin = Integer.MAX_VALUE;
            for (int j = 0; j < M; j++) {
                rMin = Math.min(rMin, matrix[i][j]);
            }
            rowMin.add(rMin);
        }
        List<Integer> colMax = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            int cMax = Integer.MIN_VALUE;
            for (int j = 0; j < N; j++) {
                cMax = Math.max(cMax, matrix[j][i]);
            }
            colMax.add(cMax);
        }

        int count=0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (matrix[i][j] == rowMin.get(i) && matrix[i][j] == colMax.get(j)) {
                    count++;
                }
            }
        }

        return count;

    }
}
