package PMIS.day3;

public class SegmentCount {
    public static void main(String[] args) {
        //String s = "Hello, my name is John";
        String s = "Hello";
        char[] ch = s.toCharArray();
        int n = s.length();
        int count =0;
        for(int i = 0;i<n;i++){
            if (s.charAt(i) != ' ' &&
                    (i == 0 || s.charAt(i - 1) == ' ')) {
                count++;
            }
        }
        System.out.println(count);
    }
}
