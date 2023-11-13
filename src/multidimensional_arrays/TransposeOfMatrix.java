package multidimensional_arrays;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 5 }, { 3, 4, 6 }, { 7, 8, 9 } };

        // int[][] ans = transposeMatrix(matrix, 2,3);
        System.out.println("The Transpose for the given Square matrix is: ");
        transposeInPlace(matrix, 3, 3);
        printArray(matrix);
    }

    static int[][] transposeMatrix(int[][] matrix, int r, int c) {
        int[][] ans = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = matrix[j][i];
            }
            System.out.println();
        }

        return ans;
    }

    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // without using extra space it is valid for square matrix only

    static void transposeInPlace(int[][] arr, int r, int c) {
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}
