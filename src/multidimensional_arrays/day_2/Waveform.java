package multidimensional_arrays.day_2;

public class Waveform {
    public static void main(String[] args) {

        int[][] arr = {{3,6,4,2},
                      {7,8,11,5},
                      {9,3,2,1}};
            printArrayInWaveForm(arr,3,4);
        System.out.println();
            approachTwo(arr,3,4);
    }

    private static void printArrayInWaveForm(int[][] arr, int r, int c){
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(arr[j][i]+" ");
            }
        }
    }

    private static void approachTwo(int[][] arr, int r, int c){
        for (int j = 0; j < c; j++) {
            if (j % 2 == 0){   // even column
                for (int i = 0; i < r; i++) {
                    System.out.print(arr[i][j]+" ");
                }
            }

            else {
                for (int i = r-1; i >=0 ; i--) {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}
