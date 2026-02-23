package PMIS.day4;

public class AMadeWithB {
    public static void main(String[] args) {
        String a = "aa";
        String b = "aab";
//        String a = "a";
//        String b = "b";
//        String a = "aa";
//        String b = "ab";
        int[] freq = new int[128];
        int n = a.length();
        int m = b.length();
        for(int i=0;i<n;i++){
            freq[a.charAt(i)]++;
        }
        for(int i=0;i<m;i++){
            freq[b.charAt(i)]--;
        }
        for(int i=0;i<n;i++){
            if(freq[a.charAt(i)]!=0){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
