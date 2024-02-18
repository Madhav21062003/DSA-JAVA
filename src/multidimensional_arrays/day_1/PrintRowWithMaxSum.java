package multidimensional_arrays.day_1;

public class PrintRowWithMaxSum {
    public static void main(String[] args) {
            int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
            int maxSum = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < 3; i++) {
            int sum = 0;

            for (int j = 0; j < 3; j++) {
                sum = sum + arr[i][j];
            }
            if (sum > maxSum){
                maxSum = sum;
                index = i;
            }
        }
        System.out.println(index);
        System.out.println(maxSum);
    }
}
