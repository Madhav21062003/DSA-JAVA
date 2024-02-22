package multidimensional_arrays.day_3;

public class RotateMatrixBy180 {
    public static void main(String[] args) {

        int[][] matrix = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
//        rotateMatrix180(matrix);
        rotate(matrix);
    }
//
    static void rotate(int[][] matrix){
        int n = matrix.length;


//         Outer loop for reversing the column
        for (int i = n-1; i >= 0; i--) {

            // inner loop for reversing the row
            for (int j = n-1; j >=0 ; j--) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }


    static void rotateMatrix180(int[][] matrix){
       int n = matrix.length;


        // using Swap method
        // Reversing the column
        for (int i = 0; i < n; i++) {
            int start = 0, end = n-1;
            while (start < end){
                int temp = matrix[start][i];
                matrix[start][i] = matrix[end][i];
                matrix[end][i] = temp;
                start++;
                end--;
            }
        }

        // Reversing the row
        for (int i = 0; i < n; i++) {
            int start = 0, end = n-1;
            while (start < end){
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
