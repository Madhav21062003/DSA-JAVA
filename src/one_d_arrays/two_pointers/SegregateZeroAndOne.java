package one_d_arrays.two_pointers;

public class SegregateZeroAndOne {
    public static void main(String[] args) {

        // Sort the array by using two Pointer approach
        int[] arr = {1, 0, 1, 0, 1, 0, 0};
        segregateZeroAndOne(arr);

        // Using Two Pointer Approach
        int[] a = {1, 0, 1, 0, 1, 0, 0, 1, 0};
        segregate0and1(a);

    }

    // BruteForce approach TC = O(n)
    static void segregateZeroAndOne(int[] arr) {
        int count0 = 0, count1 = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0)
                count0++;
            else
                count1++;
        }

        // Filling  Starting indices with zero in array
        for (int i = 0; i < count0; i++) {
            arr[i] = 0;
        }

        // Filling remaining indices with 1
        for (int i = count1; i < arr.length - 1; i++) {
            arr[i] = 1;
        }

        // Printing Sorted array Elements
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void segregate0and1(int[] arr) {
        // code here

        int start = 0, end = arr.length-1;

        while(start < end){
            if(arr[start] == 0)
                start++;

            else {
                if(arr[end] == 0){
                    int temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                    start++;
                    end--;
                }
                else {
                    end--;
                }
            }
        }

        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+" ");
        }
    }


}
