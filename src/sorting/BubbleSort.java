package sorting;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] arr1 = {1,2,3,4,5};
        bubbleSort(arr1);
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = n - 2; i >= 0; i--) {

            boolean swappingOccur = false;
            for (int j = 0; j <= i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swappingOccur = true;
                }

                if (!swappingOccur)
                    return;
            }
        }

    }
}
