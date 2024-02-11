package binary_search.problems;

public class RotatedArray {
    public static void main(String[] args) {

        int[] arr = {4,6,8,10,1,2};
        System.out.println(minElementInRotatedArray(arr));
    }

    static int minElementInRotatedArray(int[] arr){
        int start = 0, end = arr.length-1;
        int ans = -1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            
            if (arr[mid] >= arr[0])  // Array is Sorted in Left side
                start = mid + 1 ;

            else if (arr[mid] < arr[0]) {   // Array is sorted into the right half of the array
                ans = arr[mid];
                end = mid - 1;
            }
        }
        return ans ;
    }
}
