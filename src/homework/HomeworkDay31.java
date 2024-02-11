package homework;

public class HomeworkDay31 {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7};
        int key = 6;
        System.out.println(searchInsert(arr, key));
    }

    // Problem link - https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
    // 34. Find First and Last Position of Element in Sorted Array

    public static int[] searchRange(int[] nums, int target) {

        int[] result = {firstOccurence(nums, target), lastOccurence(nums, target)};
        return result;
    }

    static int firstOccurence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int first = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                first = mid;
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else
                end = mid - 1;
        }
        return first;
    }

    static int lastOccurence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int last = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                last = mid;
                start = mid + 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else
                end = mid - 1;
        }
        return last;
    }


    // Problem link - https://leetcode.com/problems/search-insert-position/description/
    //  35. Search Insert Position

    public static int searchInsert(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        int index = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                index = mid;
                end = mid - 1;
            }
        }
        if (target > arr[arr.length - 1])
            return arr.length;
        return index;
    }

    // Problem Link 69 -> https://leetcode.com/problems/sqrtx/
    public static int mySqrt(int x) {

        int start = 1, end = x, ans = 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == x)
                return mid;

            else if (mid * mid < x) {
                ans = mid;
                start = mid + 1;
            } else
                end = mid - 1;
        }
        return ans;
    }

    // Problem - 1539. Kth Missing Positive Number
    // problem link - https://leetcode.com/problems/kth-missing-positive-number/description/
    public static int findKthPositive(int[] arr, int k) {

        // Brute Force Approach
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i] <= k)
        //     k++;
        //     else
        //         break;
        // }
        //     return k;

        // Optimised Approach using Binary Search
        int start =0, end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            int missingNumbers = arr[mid] - (mid + 1);

            if(missingNumbers < k)
                start = mid + 1 ;
            else
                end = mid - 1;
        }

        return end + k + 1 ;
    }

}
