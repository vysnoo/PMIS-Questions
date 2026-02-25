package PMIS.day11;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("aba"));
        System.out.println(longestPalindrome("cbba"));
        System.out.println(longestPalindrome("a"));

    }
    public static String longestPalindrome(String s) {
        String res = "";
        for(int i =0;i<s.length();i++){
            String oddCheck = checkWindow(s,i,i);
            String evenCheck = checkWindow(s,i,i+1);
            res = res.length() < oddCheck.length() ? oddCheck : res;
            res = res.length() < evenCheck.length() ? evenCheck : res;
        }
        return res;
    }

   static public String checkWindow(String str,int s,int e){
        while(s>=0 && e<str.length() && str.charAt(s)==str.charAt(e)){
            s--;
            e++;
        }
        return str.substring(s+1,e);
    }
}
