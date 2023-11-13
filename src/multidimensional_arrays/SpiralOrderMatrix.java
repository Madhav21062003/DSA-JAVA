package multidimensional_arrays;

public class SpiralOrderMatrix {
    public static void main(String[] args) {

        int[][] arr = {{1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}


        };

        printSpiralOrder(arr, 5,5);
    }


    static void  printSpiralOrder(int[][] matrix, int r, int c){
        int topRow = 0, bottomRow = r-1, leftColumn = 0, rightColumn = c - 1;
        int totalElements  = 0;

        while (totalElements < r*c){

            // Top row => leftCol to rightCol
            for (int j = leftColumn; j<=bottomRow && totalElements < r*c; j++) {
                System.out.print(matrix[topRow][j]+" ");
                totalElements++;
            }
            topRow++;

            // rightCol -> topRow to BottomRow
            for (int i = topRow; i <= bottomRow && totalElements < r*c; i++) {
                System.out.print(matrix[i][rightColumn]+" ");
                totalElements++;
            }
            rightColumn--;

            // bottomRow -> rightCol to leftCol
            for (int j = rightColumn; j >= leftColumn && totalElements < r*c; j--) {
                System.out.print(matrix[bottomRow][j]+" ");
                totalElements++;
            }
            bottomRow--;

            // leftCol -> bottomRow to topRow
            for (int i = bottomRow; i >= topRow && totalElements < r*c ; i--) {
                System.out.print(matrix[i][leftColumn]+" ");
                totalElements++;
            }
            leftColumn++;
        }
    }
}
