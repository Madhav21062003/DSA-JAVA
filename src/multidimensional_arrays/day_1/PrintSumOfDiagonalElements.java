package multidimensional_arrays.day_1;

public class PrintSumOfDiagonalElements {
    public static void main(String[] args) {

        int[][] arr =  {{1,2,3},{4,5,60},{7,8,9}};
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i == j){
                    sum = sum + arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
