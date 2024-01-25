package one_d_arrays.basic_problems;

import java.util.Arrays;

public class SecondMax {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 16, 7, 8, 98};
        int result = secondMaxElement(arr);
        System.out.println(result);
    }

    private static int secondMax(int[] arr) {
        return 1;
    }

    //  Using Sorting Method in java
    private static int secondMaxElement(int[] arr){
        Arrays.sort(arr);


        return arr[arr.length-2];
    }
}
