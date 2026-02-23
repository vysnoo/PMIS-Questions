package PMIS.day3;

import java.util.HashMap;
import java.util.Map;

public class PatternMap {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        Map map = new HashMap<>();
        char[] ch = pattern.toCharArray();
        String[] strs = s.split("\\s");
        int n = pattern.length();
        boolean bool = true;

        if(n != strs.length){
            System.out.println(false);
            return;
        }

        for(int i=0;i<n;i++){
            if(map.put(ch[i],i) != map.put(strs[i],i)){
                bool = false;
                break;
            }
        }
        System.out.println(bool);
    }
}
