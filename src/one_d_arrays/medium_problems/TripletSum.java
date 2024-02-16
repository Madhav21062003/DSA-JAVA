package one_d_arrays.medium_problems;

public class TripletSum {
    public static void main(String[] args) {

        int[] arr_1 = {1,4,5,6,3};
        int target_1 = 12 ;
        System.out.println("Number of pairs which gives us this target sum = "+tripletSum(arr_1, target_1));
    }

    private static int tripletSum(int[] arr1, int target1) {

        int n = arr1.length;
        int ans = 0 ;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if (arr1[i] + arr1[j] + arr1[k] == target1)
                        ans ++ ;

                }
            }
        }
        return ans;
    }


}
