package one_d_arrays.two_pointers;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {

        int[] arr = {2,7,11,15,27};
        twoSum(arr,34);
    }

    // Using Two pointer Approach if the array is already sorted TC = O(n)
    static void twoSum(int[] arr, int target){
       int start = 0, end = arr.length-1;

        for (int i = 0; i < arr.length-1; i++) {
            int sum = arr[start] + arr[end];

            if (sum  == target){
                System.out.println(arr[start]+" "+arr[end]);
                break;
            }

            else if (sum > target) {
                end--;
            }
            else if (sum < target) {
                start++;
            }

        }
    }


}
