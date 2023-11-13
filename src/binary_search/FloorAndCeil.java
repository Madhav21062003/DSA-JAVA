package binary_search;

import java.util.Arrays;

public class FloorAndCeil {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 7};
        int m = 0;
//        int result = ans(arr, m);
//        System.out.println(result);

        int [] arr1 = {1,8,9,10,6,44};
        int k  = 3;
        int ans = findKthLargest(arr1, k) ;
        System.out.println(ans);

    }

    static int ans (int[] arr, int x){
        int a = findFloor(arr, x);
        int b = findCeil(arr, x);
        System.out.print(a+" ");
        return b ;
    }

    static int findFloor(int[] arr, int m) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        int mid = low + (high - low) / 2;

        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] <= m) {
                ans = arr[mid];
                low = mid + 1;
            } else
                high = mid - 1;
        }
        return ans;
    }

    static int findCeil(int[] arr, int m) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        int mid = low + (high - low) / 2;

        while (low <= high) {
            mid = low + (high - low) / 2 ;
            if (arr[mid] >= m) {
                ans = arr[mid];
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return ans;
    }

    static int findKthLargest(int[] arr,int k){
        Arrays.sort(arr);
        int ans = arr[arr.length-k] ;
        return ans ;
    }
}
