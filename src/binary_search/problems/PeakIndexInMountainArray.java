package binary_search.problems;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {

        int[] arr = {2,4,6,8,10,11,8,5};
        System.out.println("Peak Index in The Array is: "+peakIndexInMountainArray(arr));
    }

    // Problem link -  https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/1172177912/
    static int peakIndexInMountainArray(int[] arr){
        int start = 0, end = arr.length-1;

        while (start <= end){
//            int mid = start + (end - start) / 2;  ex - >  1 6 3 2 1
            int mid = end + (start - end) / 2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1])
                return mid;

            else if (arr[mid] > arr[mid-1])
                start = mid + 1 ;

            else
                end = mid - 1;
        }
        return -1;
    }
}
