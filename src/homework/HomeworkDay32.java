package homework;

public class HomeworkDay32 {
    public static void main(String[] args) {

    }

    // 852. Peak Index in a Mountain Array  --> https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            // int mid = start + (end - start)/2;
            int mid = end + (start - end) / 2;

            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])
                return mid;

            else if (arr[mid] > arr[mid - 1])
                start = mid + 1;

            else
                end = mid - 1;
        }
        return -1;
    }

    // Peak element -> https://www.geeksforgeeks.org/problems/peak-element/1
    public int peakElement(int[] arr, int n) {


        boolean flag = false;
        int i = 1;
        while (i < n) {
            if (arr[i] > arr[i - 1]) {
                i++;
            } else {
                flag = true;
                return i - 1;
            }
        }
        if (!flag) {
            return n - 1;
        }
        return 0;
    }

    // 153. Find Minimum in Rotated Sorted Array-> https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
    public int findMin(int[] arr) {
        int start = 0, end = arr.length - 1;
        int ans = arr[0];
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] >= arr[0])  // Array is Sorted in left side then go to Right
                start = mid + 1;

            else if (arr[mid] < arr[0]) {
                ans = arr[mid];
                end = mid - 1;
            }
        }
        return ans;
    }


    // 33. Search in Rotated Sorted Array -> https://leetcode.com/problems/search-in-rotated-sorted-array/description/
    public static int search(int[] arr, int target) {

        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;

                // Left Side Sorted
            else if (arr[mid] >= arr[0]) {
                // Going to left side of the array
                if (arr[start] <= target && arr[mid] > target)
                    end = mid - 1;
                else
                    start = mid + 1;
            }

            // Right Side sorted
            else {
                if (arr[mid] < target && arr[end] >= target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    // .1539- Kth Missing Positive Number - https://leetcode.com/problems/kth-missing-positive-number/description/
    public int findKthPositive(int[] arr, int k) {

        // Brute Force Approach
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i] <= k)
        //     k++;
        //     else
        //         break;
        // }
        //     return k;

        // Optimised Approach using Binary Search
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int missingNumbers = arr[mid] - (mid + 1);

            if (missingNumbers < k)
                start = mid + 1;
            else
                end = mid - 1;
        }

        return end + k + 1;
    }

    // Peak Element https://leetcode.com/problems/find-peak-element/description/
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if (n < 1) return -1;
        if (n == 1) return 0;
        if (nums[0] > nums[1]) return 0;
        if (nums[n - 1] > nums[n - 2]) return n - 1;

        int low = 1;
        int high = n - 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (nums[mid] > nums[mid - 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }


    // Search in Rotated Sorted Array II -> https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/
     static boolean searchInRoatedSortedArrayTwo(int[] nums, int target) {

        int n =  nums.length;

        for(int i = 0 ;i< n;i++)
        {
            if(target == nums[i])
            {
                return true;

            }
            else if(i==n-1 &&  target != nums[i])
            {
                break;
            }
        }
        return false;
    }

    // 1608. Special Array With X Elements Greater Than or Equal X
    // https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/description/
    public static int specialArray(int[] nums) {
        int start=0;
        int end=nums.length;
        while(start<=end){
            int mid=start+(end-start)/2;
            int count=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]>=mid){
                    count++;
                }
            }
            if(count==mid) return mid;
            if(count>mid) start=mid+1;
            else end=mid-1;
        }
        return -1;
    }

    // 367. Valid Perfect Square - > https://leetcode.com/problems/valid-perfect-square/description/?source=submission-ac
    public static boolean isPerfectSquare(int num) {

        // Optimise approach using Binary search
        int start = 0, end = num;
        while(start <= end){
            long mid = start + (end - start) / 2;
            long sqMid = mid * mid ;

            if(sqMid == num){
                return true;
            }

            else if(sqMid > num){
                end = (int) mid -1;
            }
            else
                start = (int) mid + 1 ;
        }
        return false;
    }
}
