package one_d_arrays.two_pointers;

import java.util.Arrays;

public class PairWithGivenDifference {
    public static void main(String[] args) {

        int[] arr = {2,3,5,10,50,80};
        int target = 45;
        pairWithTargetDifference(arr, target);
    }

    private static void pairWithTargetDifference(int[] arr, int target) {
        Arrays.sort(arr);
        int start = 0, end = 1;
        while (end <arr.length){
            int diff = arr[end] - arr[start];

            if (diff == target){
                System.out.println(arr[end]+" "+arr[start]);
                break;
            } else if (diff < target) {
                end++;
            }
            else
                start++;

        }
    }
}
