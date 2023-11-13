package sorting;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;

        // n-1 iteration / passes
        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;  // has any swapping happened
            for (int j = 0; j < n - i - 1; j++) {
                // last ith element
                // nt ar correct sorted positions so no need to check them
                if (arr[j] > arr[j + 1]) {
                    // swap a[j] , a[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true; // it means some swaps happened
                }
                if (!flag){
                    return;
                }
            }
        }
    }
}
