package one_d_arrays.medium_problems;

import java.util.Arrays;

public class SubarraySum {
    public static void main(String[] args) {

        int[] arr = {1,2,3,7,5};
        int givenSum = 12 ;

        System.out.println(Arrays.toString(subArraySum(arr,givenSum)));
    }

    static int[] subArraySum(int[]arr, int givenSum){
        int leftPointer = 0 ;
        int rightPointer = 0 ;
        int n = arr.length;
        int[] ans;

        // if the given sub array sum is 0
        if (givenSum == 0){
            ans = new int[]{-1};
            return ans ;
        }

        boolean isFound = false ;
        int sum = arr[0];

        while (rightPointer < n){
            if (sum == givenSum){
                isFound = true ;
                break;
            } else if (sum < givenSum) {
                rightPointer++ ;
                if (rightPointer < n){
                    sum = sum + arr[rightPointer] ;
                }
            }
            else {
                sum = sum - arr[leftPointer];
                leftPointer++ ;
            }
        }

        if (isFound){
            ans = new int[]{leftPointer + 1, rightPointer + 1};
            return ans ;
        }

        return new int[]{-1};

    }
}
