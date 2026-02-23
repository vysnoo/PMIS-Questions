package PMIS.day4;

public class StringAddition {
    public static void main(String[] args) {

        String num1 = "11";
        String num2 = "129";

        int p1 =num1.length()-1;
        int p2= num2.length()-1;
        String res = "";
        int rem =0;
        while(p1>=0 || p2>=0 || rem!=0){
            int sum = rem;
            if(p1>=0){
                sum += num1.charAt(p1)-48;
                p1--;
            }
            if(p2>=0){
                sum += num2.charAt(p2)-48;
                p2--;
            }
            res =  sum%10 + res;
            rem = sum/10;
        }

        System.out.println(res);
    }
}
