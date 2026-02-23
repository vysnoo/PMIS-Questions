package PMIS.day5;

public class FirstDigit {
    public static void main(String[] args) {
        //int num = 5722551;
        int num =  998877 ;
        String s = Integer.toString(num);
        int n = s.length();
        int[] freq = new int[60];
        for(int i=0;i<n;i++) {
            freq[s.charAt(i)]++;
        }
        for(int i=0;i<n;i++) {
            if(freq[s.charAt(i)]==1) {
                System.out.println(s.charAt(i)-48);
                return;
            }
        }
        System.out.println(-1);
    }
}
