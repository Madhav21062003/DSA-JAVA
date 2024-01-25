package one_d_arrays.problemspart2;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        reverseArray(arr);
//        System.out.println();
//        System.out.println(Arrays.toString(reverseArrayMethod2(arr)));

//        reverseArrayMethod3(arr);
    }


    static void reverseArray(int[] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
    }

    static int[] reverseArrayMethod2(int[]arr){
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0 ;

        for (int i = n-1; i >= 0 ; i--) {
            ans[j] = arr[i];
            j++;
        }
        return ans;
    }


}
