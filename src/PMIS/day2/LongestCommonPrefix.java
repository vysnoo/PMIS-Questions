package PMIS.day2;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        int n = strs.length;
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[n-1];
        int min = first.length()<last.length()? first.length(): last.length();
        String res = "";
        for(int i=0;i<min;i++){
            if(first.charAt(i)==last.charAt(i)){
                res += first.charAt(i);
            }else{
                break;
            }
        }
        System.out.println(res);
    }
}
