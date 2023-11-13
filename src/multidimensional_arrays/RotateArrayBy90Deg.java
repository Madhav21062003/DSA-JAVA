package multidimensional_arrays;

public class RotateArrayBy90Deg {
    public static void main(String[] args) {

        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        rotateMatrix(matrix, 4);
        printMatrix(matrix, 4,4);


    }

    // Step 1 find the transpose of the Given Matrix
    static void  transpose(int[][]arr, int r, int c){
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp ;
            }
        }
    }

    // step 2  reverse the each row of the matrix and then pprint it the will you get the
    // matrix which is 90deg rotated
    static void rotateMatrix(int[][]matrix, int n){
        transpose(matrix, n,n);

        for (int i = 0; i <n ; i++) {

            // we use reverse array because again and again
            // we have to reverse the each row of matrix  and the each row is in the form of 1-D array
            reverseArray(matrix[i]);
        }
    }

    static void reverseArray(int[] arr){
        int i =0 ;
        int j = arr.length-1;

        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void printMatrix(int[][]matrix, int r, int c){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
