package one_d_arrays.medium_problems.problemspart2;

public class RotateArrayByK {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
//        System.out.println(Arrays.toString(rotateArrayByK(arr, 5)));

        rotateArrayByKWithoutExtraSpace(arr,5);
        printArray(arr);
    }

    // Here we use extra space by using extra ans array
    static int[] rotateArrayByK(int[] arr, int k){
        int n = arr.length;
       k = k % n;
       int j = 0;
       int[] ans = new int[n];

       // put the right half of the array in the first end of the array
        for (int i = n-k; i < n ; i++) {
            ans[j] = arr[i];
            j++ ;
        }

        for (int i = 0; i < n-k; i++) {
            ans[j] = arr[i];
            j++;
        }
        return ans;
    }

    static  void swapArray(int[]arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp ;

    }

    static void reverseArray(int[] arr, int start, int end){

        while ( start < end){
                swapArray(arr, start, end);
            start++;
                end-- ;
        }
    }



    // Optimised Approach without using extra space
    static void rotateArrayByKWithoutExtraSpace(int[] arr, int k){
        int n = arr.length;
            k = k % n ;
        reverseArray(arr, 0, n-k-1);
        reverseArray(arr, n-k, 0);
        reverseArray(arr, 0, n-1);

    }

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length-1 ; i++) {
            System.out.println(arr[i]);
        }
    }
}
