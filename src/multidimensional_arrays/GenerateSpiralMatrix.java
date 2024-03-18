package multidimensional_arrays;

public class GenerateSpiralMatrix {
    public static void main(String[] args) {

        int[][] ans = generateSpiralMatrix(5);
        printArray(ans);
    }

// generate the spiral matrix
    static int[][] generateSpiralMatrix(int n) {

        int[][] matrix = new int[n][n];

        int topRow = 0, bottomRow = n - 1, lefttColumn = 0, rightColumn = n - 1;
        int curr = 1;

        while (curr <= n * n) {

            // toprow => leftCol to RightCol
            for (int j = lefttColumn; j <= rightColumn && curr <= n * n; j++) {
                matrix[topRow][j] = curr;
                curr++;
            }
            topRow++;

            // rightCol -> TopRow to BottomRow
            for (int i = topRow; i <= bottomRow && curr < n * n; i++) {
                matrix[i][rightColumn] = curr;
                curr++;
            }
            rightColumn--;

            // bottomRow -> rightCol to leftCol
            for (int j = rightColumn; j >= lefttColumn && curr < n * n; j--) {
                matrix[bottomRow][j] = curr;
                curr++;
            }
            bottomRow--;

            // leftCol -> bottomRow to TopRow
            for (int i = bottomRow; i >= topRow && curr < n * n; i--) {
                matrix[i][lefttColumn] = curr;
                curr++;
            }
            lefttColumn++;
        }

        return matrix;

    }

    static void printArray(int[][] arr) {
        // printing 2-D Array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
