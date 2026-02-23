package PMIS.Day9;

public class FactTrailZero {
    public static void main(String[] args) {
        //int n = 3;
        int n = 5;
        //int n = 0;

            int count = 0;
            while (n > 0) {
                n /= 5;
                count += n;
            }
        System.out.println(count);

    }

}
