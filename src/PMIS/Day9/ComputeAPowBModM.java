package PMIS.Day9;

public class ComputeAPowBModM {
    public static void main(String[] args) {
        //int A = 2, B = 10, M = 1000;
        int A = 7, B = 256, M = 13;
        System.out.println(pow(A,B,M));
    }


    public static long pow(long A,long B,long M){
        if(B==0){
            return 1;
        }
        if(B % 2 == 0){
            return pow((A * A) % M, B / 2, M);
        } else {
            return (A % M * pow(A, B - 1, M) % M) % M;
        }

    }
}
