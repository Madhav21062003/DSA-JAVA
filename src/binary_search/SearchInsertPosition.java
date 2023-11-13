package binary_search;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7 };
        int m = 3;
        int ans = searchInsert(arr,m);
        System.out.println(ans);

    }

    public static int searchInsert(int [] arr, int m){
        // Write your code here.
        int ans = arr.length;
        int low = 0;
        int high = arr.length-1;
        int mid = low + (high - low) / 2 ;

       while (low <= high){
           mid = low + (high - low) / 2 ;
           if (arr[mid] >= m){
               ans = mid ;
               high = mid - 1 ;
           }
           else
               low = mid + 1 ;
       }
        return ans;
    }
}
