package binary_search.problems;

public class SqrtX {
    public static void main(String[] args) {
        System.out.println(mySqrt(80));
    }

    // Problem Link 69 -> https://leetcode.com/problems/sqrtx/
    public static int mySqrt(int x) {
        int start = 1, end = x;
        int ans = 1;
        
        while (start <= end){
            int mid = start + (end - start) / 2 ;
            if (mid*mid == x){
                return mid;
            } else if (mid*mid < x) {
                ans = mid;
                start = mid + 1;
            }
            else
                end = mid - 1;
        }
        return ans;
    }
}
