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

    // link - https://www.geeksforgeeks.org/problems/count-the-zeros2550/1?page=1&difficulty%5B%5D=0&category%5B%5D=Searching&sortBy=submissions
    int countZeroes(int[] arr, int n) {
        // code here

        // Optimised approach using BinarySearch
        int s1 = 0, e1 = n-1, mid, firstZero = -1;

        while(s1 <= e1){
            mid = s1 + (e1 - s1) / 2;
            if(arr[mid] == 0){
                firstZero = mid;
                e1 = mid - 1;
            }

            else if(arr[mid] == 1 )
                s1 = mid + 1;

            else
                e1 = mid - 1;
        }


        int s2 = 0, e2 = n-1,  lastZero = -1;
        while(s2 <= e2){
            mid = s2 + (e2 - s2 ) / 2 ;
            if(arr[mid] == 0){
                lastZero = mid;
                s2 = mid + 1;
            }

            else if(arr[mid] == 1 )
                s2 = mid + 1;

            else
                e2 = mid - 1;
        }

        return lastZero - firstZero + 1;

    }
}
