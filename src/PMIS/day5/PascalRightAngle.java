package PMIS.day5;

public class PascalRightAngle {
    public static void main(String[] args) {
        int n = 5;
        pascalTriangle(5);

    }
    public static void pascalTriangle(int n) {
        for(int row=1;row<=n;row++) {
            int value = 1;
            for(int col = 1; col<=row;col++) {
                System.out.print(value + " ");
                value = value * (row - col) / col;
            }
            System.out.println();
        }
    }
}
