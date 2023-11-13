package recursion.recusriononarrays;

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {1, 8, 9, 7, 99, 7, 22, 8, 6, 3, 100, 44};
        System.out.println(findIndex(arr, 0, 7));
    }

    static boolean linearSearch(int[] arr, int index, int target) {
        if (index >= arr.length)
            return false;


        if (arr[index] == target)
            return true;

        if (linearSearch(arr, index + 1, target))
            return true;


        return false;
    }

    // Showing index of target element
    static int findIndex(int[] arr, int index, int target) {
        if (index >= arr.length)
            return -1;

        if (arr[index] == target)
            return index;

        return findIndex(arr, index+1, target);
    }


}
