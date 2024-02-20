package multidimensional_arrays.day_2;

public class TransposeMatrix {
    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] transposeMatrix = new int[4][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transposeMatrix[j][i] = matrix[i][j];
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(transposeMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println( );
        transposeMatrix(matrix,4,4);
    }

    // transpose the matrix without using extra space
    static void transposeMatrix(int[][] arr, int row, int col) {

        for (int i = 0; i < row - 1; i++) {
            for (int j = i + 1; j < col; j++) {
                int tem = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = tem;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

