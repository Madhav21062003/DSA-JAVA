package one_d_arrays.medium_problems;

import java.util.Arrays;

public class PrefixAndSuffixSum {
    public static void main(String[] args) {
        int[] arr = {6,4,5,-3,2,8};
        System.out.println(Arrays.toString(prefixSum(arr)));
        System.out.println(Arrays.toString(suffixSum(arr)));
    }

    // Prefix sum
    static int[] prefixSum(int[] arr){
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }
        return prefix;
    }

    // Suffix Sum
    static int[] suffixSum(int[] arr){
        int[] suffix = new int[arr.length];

        // Last Index value remain same
        suffix[arr.length-1] = arr[arr.length-1];

        for (int i = arr.length-2; i >=0 ; i--) {
            suffix[i] = suffix[i+1] + arr[i];
        }
        return suffix;
    }
}
