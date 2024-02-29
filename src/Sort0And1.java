public class Sort0And1 {
    public static void main(String[] args) {

        int arr[] = {1, 0, 1, 1, 1, 1, 1, 0, 0, 0};
        int n = arr.length;
        binSort(arr, n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void binSort(int A[], int N) {
        // add your code here
        int start = 0, end = A.length - 1;

        while (start <= end) {
            if (A[start] > A[end]) {
                int temp = A[start];
                A[start] = A[end];
                A[end] = temp;
                start++;
                end--;
            }
        }



        /**************
         * No need to print the array
         * ************/
    }
}