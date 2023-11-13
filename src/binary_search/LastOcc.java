package binary_search;

public class LastOcc {
    public static void main(String[] args) {

        int[] arr = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int key = 5;
        System.out.println("The first occurrence of the element is: " + latOcc(arr, key));
    }

    static int latOcc(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        int lastOcc = -1;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                lastOcc = mid;
                start = mid + 1;
            } else if (arr[mid] < key)
                start = mid + 1;

            else
                end = mid - 1;
        }
        return lastOcc;
    }
}
