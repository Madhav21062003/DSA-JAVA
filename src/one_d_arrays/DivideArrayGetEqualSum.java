package one_d_arrays;

public class DivideArrayGetEqualSum {
    public static void main(String[] args) {

        int[] arr = {3,4,-2,5,8,20,-10,8};
        System.out.println(divideArrayToGetEqualSum(arr));
        System.out.println(divideArrayToGetSumEqual(arr));
    }

    // Tc = O(n^2)
    static boolean divideArrayToGetEqualSum(int[] arr){

        // we divide array from 1st index to n-1th index
        for (int i = 0; i < arr.length-1; i++) {
            int sum1 = 0, sum2 = 0;

            for (int j = 0; j <= i; j++) {
                sum1 += arr[j];
            }

            for (int j = i+1; j < arr.length; j++) {
                sum2 += arr[j];
            }

            if (sum1 == sum2) return true;
        }
        return false;
    }

    static boolean divideArrayToGetSumEqual(int[] arr){
        int n = arr.length;
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        int prefix = 0;
        int ans ;
        for (int i = 0; i < n; i++) {
            prefix += arr[i];
             ans = totalSum - prefix;
            if (ans == prefix)
                return true;
        }
        return false;
    }
}
