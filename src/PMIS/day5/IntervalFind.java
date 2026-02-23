package PMIS.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class IntervalFind {

    public static void main(String[] args) {
        int[][] person1 = {{1,3}, {6,7}};
        int[][] person2 = {{2,4}, {7,9}};
        //int[][] person1 = {{1,5}, {6,8}};
        //int[][] person2 = {{2,6}, {8,10}};
        int duration = 1;
        int[][] intervals = new int[person1.length + person2.length][];
        int x = 0;
       // copy person1
        for (int[] per1 : person1) {
            intervals[x++] = per1;
        }
        // copy person2
        for (int[] per2 : person2) {
            intervals[x++] = per2;
        }
        int[][] merged = mergeInterval(intervals);

        int n = merged.length;
        for(int i =0;i<n-1;i++) {
            if(Math.abs(merged[i][1]-merged[i+1][0])>=duration){
                System.out.println("["+merged[i][1]+","+ (merged[i][1]+duration)+"]");
                return;
            }
        }
        System.out.println(-1);
    }
    static int[][] mergeInterval(int[][] intervals){
        Arrays.sort(intervals, Comparator.comparingInt(i->i[0]));
        List<int[]> list = new ArrayList<>();
        int[] newInterval = intervals[0];
        list.add(newInterval);
        for(int[] interval : intervals){
            if(newInterval[1]>= interval[0]){
                newInterval[1] = Math.max(newInterval[1],interval[1]);
            }else{
                newInterval = interval;
                list.add(newInterval);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
