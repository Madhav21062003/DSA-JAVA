package homework;

public class HomeworkDay30 {
    public static void main(String[] args) {

    }

    // Search Insert Position (35)  -> https://leetcode.com/problems/search-insert-position/
    public static int searchInsert(int[] nums, int target) {

        // Write your code here.
        int ans = nums.length;
        int low = 0;
        int high = nums.length-1;
        int mid = low + (high - low) / 2 ;

        while (low <= high){
            mid = low + (high - low) / 2 ;

            if (nums[mid] >= target){
                ans = mid;
                high = mid - 1 ;
            }
            else
                low = mid + 1 ;
        }
        return ans;
    }


    // Q-2 Binary Search In Decreasing Order
    static int binarySearchDecreasingOrder(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;

            else if (arr[mid] < target)
                end = mid -1 ;

            else
                start = mid + 1;
        }
        return -1;
    }
}
