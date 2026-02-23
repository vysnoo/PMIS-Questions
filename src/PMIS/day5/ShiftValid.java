package PMIS.day5;

public class ShiftValid {
    public static void main(String[] args) {
        //String s = "abbcdd" ;
        //String s = "abdz" ;
        String s = "xyz" ;
        int n = s.length();
        char[] c = s.toCharArray();
        for(int i=0;i<n-1;i++) {
            if(c[i]==c[i+1]-1 || c[i]==c[i+1]) {
                continue;
            }else {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
