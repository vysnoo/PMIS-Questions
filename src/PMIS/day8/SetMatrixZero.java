package PMIS.day8;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
        for(int[] row : matrix){
            for (int val : row){
                System.out.print(val+" ");
            }
            System.out.println();
        }

    }

      static public void setZeroes(int[][] matrix) {

            int MARK = 0x3f3f3f3f; // safe marker, won't conflict with valid numbers

            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix[0].length; j++){
                    if(matrix[i][j] == 0){
                        markRow(matrix, i, MARK);
                        markCol(matrix, j, MARK);
                    }
                }
            }

            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix[0].length; j++){
                    if(matrix[i][j] == MARK){
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        static public void markRow(int[][] matrix, int row, int MARK){
            for(int col = 0; col < matrix[0].length; col++){
                if(matrix[row][col] != 0){
                    matrix[row][col] = MARK;
                }
            }
        }

        static public void markCol(int[][] matrix, int col, int MARK){
            for(int row = 0; row < matrix.length; row++){
                if(matrix[row][col] != 0){
                    matrix[row][col] = MARK;
                }
            }
        }

}
