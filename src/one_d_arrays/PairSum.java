package one_d_arrays;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {4,6,3,5,8,2};
        int target = 7;
        System.out.println("Number of pairs which gives us this target sum = "+pairSum(arr, target));

        int[] arr_1 = {1,4,5,6,3};
        int target_1 = 12 ;
        System.out.println(pairSum(arr_1, target_1));
    }

    static int pairSum(int[]arr, int target){

        int n = arr.length;
        int ans = 0 ;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] + arr[j] == target)
                    ans ++ ;
            }
        }

        return ans ;
    }
}
