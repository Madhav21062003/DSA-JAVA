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

        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }
}
