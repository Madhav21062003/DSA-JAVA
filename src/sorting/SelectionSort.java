package sorting;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        selectionSortInAscending(arr);
        System.out.println("Sort In Ascending Order");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] arr_1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Sort In Descending Order");
        selectionSortInDescending(arr_1);
        for (int j : arr_1) {
            System.out.print(j + " ");
        }

    }

    // In Ascending Order
    static void selectionSortInAscending(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            // Finding The smallest Element from the array
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j ;
            }
            // Swap the minimum element with Greater element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    static void selectionSortInDescending(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int max_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[max_idx]) {
                    max_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[max_idx];
            arr[max_idx] = temp;
        }
    }

}
