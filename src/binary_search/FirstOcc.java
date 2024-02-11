package binary_search;

public class FirstOcc {
    public static void main(String[] args) {

        int[] arr = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int key = 5;
        System.out.println("The first occurrence of the element is: " + firstOcc(arr, key));
    }

    static int firstOcc(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int firstOcc = -1;
        while (start <= end) {
          int  mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                firstOcc = mid;
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else
                end = mid - 1;

        }
        return firstOcc;
    }
}
