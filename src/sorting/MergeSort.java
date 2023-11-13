package sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4, 7, 20, 2, 8, 11};
        System.out.println("Array before Sorting: ");
        displayArray(arr);
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Array After sorting: ");
        displayArray(arr);
    }

    static void mergeSort(int[] arr, int l, int r) {

        if (l >= r)
            return;

        // step 1 - find mid
        int mid = (l + r) / 2;

        // Sorting the 1st half
        mergeSort(arr, l, mid);

        // Sorting the second half
        mergeSort(arr, mid + 1, r);

        // Merge the both sorted half into a single sorted array
        merge(arr, l, mid, r);

    }

    static void merge(int[] arr, int l, int mid, int r) {

        // left array size
        int n1 = mid - l + 1;
        int[] left = new int[n1];

        //  right array size
        int n2 = r - mid;
        int[] right = new int[n2];

        int i, j, k;

        // filling the left half sorted array elements into left array
        for (i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }

        // filling the right half sorted array elements into right array
        for (j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }

        i = 0;
        j = 0;
        k = l;

        // merging the sorted Sub arrays into a single sorted array
        while (i < n1 && j < n2) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                k++;
                i++;
            } else {
                arr[k] = right[j];
                k++;
                j++;
            }
        }

        // for the remaining elements that are left in right subarray or left subarray
        while (i < n1) {
            arr[k] = left[i];
            k++;
            i++;
        }

        while (j < n2) {
            arr[k] = right[j];
            k++;
            j++;
        }
    }

    static void displayArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
