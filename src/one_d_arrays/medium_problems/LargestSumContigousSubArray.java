package one_d_arrays.medium_problems;

public class LargestSumContigousSubArray {
    public static void main(String[] args) {

    }

    // Brute force approach

    static int lagestContigosSubArraySum(int[] arr){
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int prefix = 0;
            for (int j = i; j < arr.length; j++) {
                prefix += arr[j];
                maxi = Math.max(maxi, prefix);
            }
        }
        return  maxi;
    }

    // Optimal Approach using Kadanes's Alagorithm
    static long kadanesAlgorithm(int[] arr){
        long n = arr.length;
        long maxi = Integer.MIN_VALUE;
        long prefix = 0;

        for(int i=0; i<n; i++){
            prefix += arr[i];
            maxi = Math.max(prefix, maxi);

            if(prefix < 0)
                prefix  = 0;

        }

        return  maxi;
    }
}
