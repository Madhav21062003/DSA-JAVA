package multidimensional_arrays.day_3;

public class RotateMatrixBy90Clockwise {
    public static void main(String[] args) {

        int[][] matrix = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};

        // Bruteforce approach
//        rotateMatrix(matrix);

        // Optimised Approach
        rotateMatrixBy90(matrix);


    }

    // Bruteforce approach
    static void rotateMatrix(int[][]matrix){
        int[][] ans = new int[matrix.length][matrix[0].length];
        // Brute force Approach
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                ans[j][matrix.length-1-i] = matrix[i][j];
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }

    // optimised Approach without Using Extra Space
    static void rotateMatrixBy90(int[][]matrix){

        // s-1 covert the given matrix into transposed matrix form
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i+1; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }

        }

        // Reverse each row of a transposed matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix.length-1; j >= 0; j--) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
