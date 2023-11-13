package sorting;

public class QuickSort {
    public static void main(String[] args) {

        int[] arr = {6, 3, 1, 5, 4};
        System.out.println("Array before Sorting");
        displayArray(arr);
        System.out.println();
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Array after sorting");
        displayArray(arr);
    }

    static void quickSort(int[] arr, int start, int end) {
        // base case
        if (start >= end)
            return;

        // finding the pivot element index
        int pivotIndex = partition(arr, start, end);

        // for solving lest half
        quickSort(arr, start, pivotIndex - 1);

        // for solving right half
        quickSort(arr, pivotIndex + 1, end);
    }

    static int partition(int[] arr, int start, int end) {
        // let assume first element of the array is to be pivot element
        int pivot = arr[start];

        // count the elements thar are less then pivot element
        int count = 0;
        for (int i = start + 1; i <= end; i++) {
            // in case array contains the duplicates of pivot element we will put those on left side on the array
            if (arr[i] <= pivot) {
                count++;
            }
        }
        int pivotIndex = start + count;
        swap(arr, start, pivotIndex);

        // now we put elements less than pivot index on the left side of the array and elements greater than pivot on the right
        // side of the array
        int i = start, j = end;

        while (i < pivotIndex && j > pivotIndex) {
            while (arr[i] <= pivot)
                i++;
            while (arr[j] > pivot)
                j--;

            // check if  we already on the pivot index
            if (i < pivotIndex && j > pivotIndex) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIndex;
    }

    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static void displayArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
