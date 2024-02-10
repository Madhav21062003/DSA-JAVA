package binary_search;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {2, 4, 5, 7, 24, 45, 50, 77};
        int key = 7;

        int ans = binarySearch(arr, key);
        if (ans != -1)
            System.out.println("The Element is  present in the array at index " + ans);
        else
            System.out.println("The element is not present in the array ");
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;

            else if (arr[mid] < target)
                start = mid + 1;

            else
                end = mid - 1;
        }
        return -1;
    }
}
