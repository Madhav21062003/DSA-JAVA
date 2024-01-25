package one_d_arrays.basic_problems;

import java.util.Arrays;

public class SecondMax {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 16, 7, 8, 98};
        int result = secondMaxElement(arr);
        System.out.println("Second Max Element in the array is: "+result);

        int[] a = {2,6,4,3,8,5,1};
        System.out.println("Second Max Element in the array is: "+secondMax(a));
    }

    private static int secondMax(int[] arr) {
            
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans)
                ans = arr[i];
        }
                int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if ( ans != arr[i])
             secondMax = Math.max(secondMax, arr[i]);
        }
        return secondMax;
    }

    //  Using Sorting Method in java
    private static int secondMaxElement(int[] arr){
        Arrays.sort(arr);


        return arr[arr.length-2];
    }
}
