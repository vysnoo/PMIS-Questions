package PMIS.day2;

public class reverse {
    public static void main(String[] args) {
        int n = -123;
        int sum =0;
        while(n!=0){
            int l = n%10;
            sum = sum *10 + l;
            if(sum< Integer.MIN_VALUE/10 || sum>Integer.MAX_VALUE/10){
                System.out.println(0);
                return;
            }
            n/=10;
        }
        System.out.println(sum);
    }
}
