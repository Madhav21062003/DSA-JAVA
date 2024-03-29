package one_d_arrays.medium_problems;

public class MaxMinElement {
    public static void main(String[] args) {

//        int[] arr = {1,8,6,6,99,5,555} ;
        maxMinElement(new int[]{1,8,6,6,99,5,555});
    }

    static void maxMinElement(int[] arr){
        int maxElement = Integer.MIN_VALUE;
        int minElement = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxElement){
                maxElement = arr[i];
            }
        }
        System.out.println("Maximum Element in the array: "+maxElement);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minElement)
                minElement = arr[i];
        }
        System.out.println("Minimum Element in the array: "+minElement);
    }
}
