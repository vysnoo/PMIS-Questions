package PMIS.day1;

public class ExpandedNoString {
    public static void main(String[] args) {
        //int n = 12;
        int n = 70304;

        String out = "";
        int sum =0;
        int pow =0;
        while(n>0){
            int l = n%10;
            sum = l * (int) Math.pow(10,pow++);

            if(sum !=0) {
                if (n / 10 != 0) {
                    out = " + " + sum + out;
                } else {
                    out = sum + out;
                }
            }
            n /= 10;
        }
        System.out.println(out);
    }
}
