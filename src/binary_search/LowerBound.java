package binary_search;

public class LowerBound {
    public static void main(String[] args) {

        int[] arr = {1,2,3,3,4,7,8,9,9};
        int m = 4;
        int ans = lowerBound(arr, m) ;
        System.out.println(ans);

    }

    static int lowerBound(int[] arr, int m){
        int low = 0;
        int high = arr.length-1;
        int mid = low + (high - low) / 2 ;
        int ans = arr.length;
        while (low <= high){
            mid = low + (high - low) / 2 ;
            if (arr[mid] >= m){
                ans = arr[mid];
                high = mid - 1;
            }
            else
                low = mid + 1 ;
        }
        return ans;
    }
}
