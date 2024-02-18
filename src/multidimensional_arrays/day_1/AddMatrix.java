package multidimensional_arrays.day_1;

public class AddMatrix {
    public static void main(String[] args) {

        int[][] matrix_1 = {{1,2,3},{4,5,6}};
        int[][] matrix_2 = {{1,2,3},{4,5,6}};
        int[][] sum = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = matrix_1[i][j] + matrix_2[i][j];
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
