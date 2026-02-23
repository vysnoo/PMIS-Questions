package PMIS.day1;

import java.util.HashMap;
import java.util.Map;

public class IndexOfRepeated {
    public static void main(String[] args) {
        // case 1
       // int[] arr1 = {10, 20, 30, 12, 5};
        //int[] arr2 = {10, 5, 30, 20};

        //case 2
        int[] arr1 = {-1, 0, 3, 2};
        int[] arr2 = {3, 4, 0, -1, 2};

        Map<Integer,Integer> map = new HashMap<>();
        int n = arr1.length;
        for(int i=0;i<n;i++){
            map.put(arr1[i],i);
        }
        int m = arr2.length;
        for(int i =0;i<m;i++){
            if(map.containsKey(arr2[i])){
                map.remove(arr2[i]);
            }else{
                map.put(arr2[i],i);
            }
        }
        String array = n<m? "Array 2 ":"Array 1 ";

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " is the extra elemnt in "+array+" at index "+ entry.getValue());
            break;
        }
    }
}
