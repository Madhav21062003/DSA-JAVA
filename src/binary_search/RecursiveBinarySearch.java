package binary_search;

public class RecursiveBinarySearch {
    public static void main(String[] args) {

        int[] arr = {2, 4, 5, 7, 24, 45, 50, 77};
        int key = 14;

        int ans = recursiveBS(arr, 0, arr.length - 1, key);

        if (ans != -1)
            System.out.println("The Element is  present in the array at index " + ans);
        else
            System.out.println("The element is not present in the array ");
    }

    static int recursiveBS(int[] arr, int start, int end, int key) {

        int mid = start + (end - start) / 2;

        if (start > end)
            return -1;

        if (arr[mid] == key)
            return mid;

        else if (arr[mid] < key)
            return recursiveBS(arr, mid + 1, end, key);

        else
            return recursiveBS(arr, start, mid - 1, key);
    }
}
