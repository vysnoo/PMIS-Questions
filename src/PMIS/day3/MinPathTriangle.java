package PMIS.day3;

import java.util.Arrays;
import java.util.List;

public class MinPathTriangle {
//    public static void main(String[] args) {
//        //int[][] tri = {{2},{3,4},{6,5,7},{4,1,8,3}};
//        int[][] tri = {{-10}};
//        int path = 0;
//        for(int[] row : tri){
//            path += minOfArray(row);
//        }
//        System.out.println(path);
//    }
//
//    static int minOfArray(int[] nums){
//        int min = Integer.MAX_VALUE;
//        int n = nums.length;
//        for(int i=0;i<n;i++){
//            min = Math.min(min,nums[i]);
//        }
//        return min;
//    }

    public static void main(String[] args) {
        List<List<Integer>> triangle = Arrays.asList(
                Arrays.asList(2),
                Arrays.asList(3,4),
                Arrays.asList(6,5,7),
                Arrays.asList(4,1,8,3)
        );
        System.out.println(minPath(triangle,0,0));


    }

    private static int minPath(List<List<Integer>> triangle, int r, int c) {
        if(r== triangle.size()-1){
         return triangle.get(r).get(c);
        }
        int down = triangle.get(r).get(c)+minPath(triangle,r+1,c);
        int diagonal = triangle.get(r).get(c)+ minPath(triangle, r+1,c+1);

        return Math.min(down,diagonal);
    }
}
