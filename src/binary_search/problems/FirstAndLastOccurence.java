package binary_search.problems;

public class FirstAndLastOccurence {
    public static void main(String[] args) {

        int[] arr = {5,7,7,8,8,8,10};
        System.out.println("First Occurrence of the Element =  "+firstOccurence(arr, 8));
        System.out.println("Last Occurrence of the Element =  "+lastOccurence(arr, 8));
    }
    // Problem link - https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
    // 34. Find First and Last Position of Element in Sorted Array
    static int firstOccurence(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int first = -1;
        while (start <= end){
            int mid = start + (end-start) / 2 ;
            if (arr[mid] == target){
                first = mid;
                end = mid-1;
            } else if (arr[mid] < target) {
                start = mid + 1 ;
            }
            else
                end = mid - 1;
        }
        return first;
    }

    static int lastOccurence(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int last = -1;
        while (start <= end){
            int mid = start + (end-start) / 2 ;
            if (arr[mid] == target){
                last = mid;
                start = mid + 1;
            } else if (arr[mid] < target) {
                start = mid + 1 ;
            }
            else
                end = mid - 1;
        }
        return last;
    }
}
