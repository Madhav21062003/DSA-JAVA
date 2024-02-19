package homework;

public class HomeworkDay41 {
    public static void main(String[] args) {

        // 1: Print sum of each column in 2D array.
        int[][] arr = {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
        int rows = 4;
        int cols = 4;
        for(int i = 0; i < cols; i++){
            int sumCol = 0;
            for(int j = 0; j < rows; j++){
                sumCol = sumCol + arr[j][i];
            }
            System.out.println("Sum of " + (i+1) +" column: " + sumCol);
        }

        // 2: Given 2 matrices A and B, Print A-B.
        int[][] A = {{10,9,8},{7,6,5}};
        int[][] B = {{1,2,3},{4,5,6}};
        int r = 2, c =3;
        int[][] difference = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                difference[i][j] = A[i][j] - B[i][j];
            }
        }
        System.out.println("Difference of two Matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(difference[i][j]+" ");
            }
            System.out.println();
        }

        // 3:  Given a matrix of size n*n, Print sum of diagonal element.
        // Ex:      1 2 3
        //          4 5 6
        //          7 8 9
        //
        //Its answer: 1+5+9 , 3+5+7, So the total sum will be 1+5+9+3+5+7 = 30. Here we can see that 5 is included 2 times,
        // so we should include it only 1 time so the final answer will be, 30-5 = 25.  So the final answer will be 25.

        int[][] arr_1 = {{1,2,3},{4,5,6},{7,8,9}};
        int diagonalSum = 0;
        // Left diagonal
        for (int i = 0; i < arr_1.length; i++) {
            for (int j = 0; j < arr_1[0].length; j++) {
                if (i == j)
                    diagonalSum = diagonalSum + arr_1[i][j];
            }
        }

        // Right diagonal
        for (int i = 0; i < arr_1.length; i++) {
            for (int j = arr_1[0].length - 1; j >= 0; j--) {
                if (i + j == arr_1.length - 1)
                    diagonalSum = diagonalSum + arr_1[i][j];
            }
        }
        if (arr_1.length % 2 == 1) {
            diagonalSum = diagonalSum - arr_1[arr_1.length / 2][arr_1.length / 2];
        }
        System.out.println("Sum of diagonal Elements is = " + diagonalSum);

        // 4: What is the column major order?

        // If elements of an array are stored in a column-major fashion means moving across the column and then to the next column
        // then it's in column-major order. To find the address of the element using column-major order use the
        // following formula: Address of A[I][J] = B + W * ((J – LC) * M + (I – LR))



        // 5: Largest Element: Find and print the largest element in the 2D array.
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (max < A[i][j]){
                    max = A[i][j];
                }
            }
        }
        System.out.println("Max Element in 2D Array: "+max);

        // 6: Smallest Element: Find and print the smallest element in the 2D arrays.
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (min > A[i][j]){
                    min = A[i][j];
                }
            }
        }
        System.out.println("Min Element in 2D Array: "+min);
    }
}
