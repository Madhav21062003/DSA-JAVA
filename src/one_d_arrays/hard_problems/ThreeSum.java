package one_d_arrays.hard_problems;

import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {

    }

    public static boolean find3Numbers(int arr[], int n, int target) {

        // Optimised Approach O(n^2)
        Arrays.sort(arr);
        for(int i=0; i<n-2; i++){
            int ans = target - arr[i];
            int start = i+1, end = n-1;

            while(start < end){
                if(arr[start] + arr[end] == ans){
                    return true;
                }
                else if(arr[start] + arr[end] > ans){
                    end--;
                }
                else
                    start++;
            }
        }
        return false;

        // Brute Force Approach O(n^3)
        // for(int i=0; i<n-1; i++){
        //     for(int j = i+1; j<n; j++){
        //         for(int k=j+1; k<n; k++){
        //             if(arr[i] + arr[j] + arr[k] == X)
        //                 return true;
        //         }
        //     }
        // }
        // return false;

    }
}
