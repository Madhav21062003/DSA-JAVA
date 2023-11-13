package binary_search;

public class UpperBound {
    public static void main(String[] args) {

        int[] arr = {1,2,3,3,4,7,8,9,9};
        int m = 9;
        int ans = upperBound(arr, m) ;
        System.out.println(ans);
    }

    static int upperBound(int[] arr, int m){
        int low = 0;
        int high = arr.length-1;
        int ans = arr.length;
        int mid = low + (high - low) / 2;

        while (low <= high){
            mid = low + (high - low) / 2 ;

            if (arr[mid] > m){
                ans = arr[mid];
                high = mid - 1 ;
            }
            else
                low = mid + 1 ;
        }
        return  ans;
    }
}
