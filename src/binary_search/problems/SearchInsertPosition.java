package binary_search.problems;

public class SearchInsertPosition {
    public static void main(String[] args) {

        int[] arr = {1,3,5,6};
        int key = 7;
        System.out.println(searchInsert(arr, key));
    }

    public static  int  searchInsert(int[] nums, int target) {

        // Write your code here.
        int start = 0, end = nums.length-1;
        int index  = -1;

        while (start <= end){
            int mid = start + (end - start) / 2 ;
            if (nums[mid] == target){
                return mid ;
            }
            else if (nums[mid] < target)
                start = mid + 1;

            else {
                index = mid;
                end = mid - 1 ;
            }
        }
        if (target > nums[nums.length-1])
            return nums.length-1;

        return index;
    }
}
