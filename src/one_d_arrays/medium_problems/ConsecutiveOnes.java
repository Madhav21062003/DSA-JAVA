package one_d_arrays.medium_problems;

public class ConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,1,0,1,1};
        System.out.println("The maximum number of consecutive number of 1's in the array = "+consecutiveOnes(arr));
    }

    static int consecutiveOnes(int[] arr){
        int n = arr.length;
        int count = 0;
        int max = 0 ;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count = count + 1;
                if(max < count) {
                    max = count;
                }
            }
            else
                count = 0 ;


        }
        return max ;
    }
}
