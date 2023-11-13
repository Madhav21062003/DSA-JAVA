package multidimensional_arrays;

public class SumOfRectangle {
    public static void main(String[] args) {

        int[][] arr = {
                {1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1},
        };

        System.out.println("The Sum of the Rectangle by approach 1 is = "+findSum(arr, 3, 1, 5, 4));
        System.out.println("The Sum of the Rectangle by Method 2 is = "+findSum2(arr, 3, 1, 5, 4));
        System.out.println("The Sum of the Rectangle by Method 3 is = "+findSum3(arr, 3, 1, 5, 4));
    }

    // Brute Force Approach = Sum of rectangle
    static int findSum(int[][] matrix, int l1, int r1, int l2, int r2){
        int sum = 0 ;
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum = sum + matrix[i][j];
            }
        }
        return sum;
    }


    // Method 2: Pre calculating the horizontal of each row inr the matrix
    static int findSum2(int[][] matrix, int l1, int r1, int l2, int r2){
        int sum = 0 ;
        findPrefixSum(matrix);

        for (int i = l1; i <= l2; i++) {
            // r1 to r2 sum of row i
            if (r1 >= 1)
            sum = sum + matrix[i][r2] - matrix[i][r1-1];

            else
                sum = sum + matrix[i][r2];
        }
        return sum;
    }

    private static void findPrefixSum(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;


        // traverse horizontally to calculate row wise prefixSum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j-1];
            }
        }
    }


    // Method -3 Prefix Sum over columns and rows both
     static int findSum3(int[][] matrix, int l1, int r1, int l2, int r2){
        int ans = 0 ;
         int sum = 0, up = 0, left = 0, leftUp = 0 ;
         findPrefixSumMatrixVertically(matrix );

        sum = matrix[l2][r2];
        if (r1 >= 1 )
        left = matrix[l2][r1-1];

         if (r1 >= 1 )
        up = matrix[l1-1][r2];

         if (l1 >= 1 && r1>=1)
        leftUp = matrix[l1-1][r1-1];

         ans = sum - up - left + leftUp ;

         return ans;
     }

     //  calculate row wise and Column wise sum
    // matrrix[i][j] = sumRectangle( (0,0), (i,j))
    static void  findPrefixSumMatrixVertically(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;

        // traverse horizontally to calculate row wise prefix sum
        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                matrix[i][j] += matrix[i-1][j];
            }
        }
    }
}
