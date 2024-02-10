package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        insertionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < arr.length; i++) {
            for (int j = n - 1; j > 0; j--)
            {
                if (arr[j] < arr[j - 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                else
                    break;

            }
        }

    }
}
