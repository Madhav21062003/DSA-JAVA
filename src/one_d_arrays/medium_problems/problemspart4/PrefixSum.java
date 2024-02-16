package one_d_arrays.medium_problems.problemspart4;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {

        int[] arr = {2,4,1,3,6,5};
        System.out.println("The prefix Sum array is: ");
//        System.out.println(Arrays.toString(prefixSumMethod2(arr)));System.out.println(Arrays.toString(prefixSum(arr,3,5)));
        System.out.println(Arrays.toString(prefixSum(arr)));


    }

    static int[] prefixSum(int[] arr){
        int n = arr.length;
        int[] prefixSumArray = new int[n];
        prefixSumArray[0] = arr[0];
            int sum = 0 ;
        for (int i = 1; i <n; i++) {
            prefixSumArray[i] = prefixSumArray[i-1] + arr[i] ;

        }

        return prefixSumArray ;
    }

    // using optimiused way to solve it without using extra space
    static int[] prefixSumMethod2(int[] arr){
        int n  = arr.length;
        for (int i = 1; i < n ; i++) {
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }


}
