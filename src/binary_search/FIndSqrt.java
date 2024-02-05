package binary_search;

public class FIndSqrt {
    public static void main(String[] args) {
        int ans = findSqrtUsingLinearSearch(10);
        System.out.println(ans);

        double result = findSqrtUsingBSPrecise(( 2.4));
        System.out.println(result);

        int ans1 = findSqrt(16);
        System.out.println(ans1);
    }
    // hdhjsjsj hhdjajs  

    static int findSqrtUsingBS(int num) {
        long ans = -1;
        int start = 0;
        long end = num;

        long mid = start + (end - start) / 2;

        while (start <= end) {
            mid = start + (end - start) / 2;
            long val = (long) mid * mid;   // using long to avoid overflow

            if (val == num)
                return (int) mid;

            else if (val < num) {
                ans = mid;
                start = (int) (mid + 1);
            } else
                end = mid - 1;
        }
        return (int) ans;
    }

    static int findSqrt(int n){
        int low = 0 ;
        int high  = n;
        int ans = -1 ;
        int mid = low + (high - low) / 2 ;

        while (low <= high){
            mid = low + (high - low) / 2 ;
            int sqr = mid * mid ;
            if (sqr == n)
                return mid;

            if (sqr < n){
                ans = mid ;
                low = mid + 1 ;
            }

            else
                high = mid -1 ;
        }
        return ans;
    }

    static double findSqrtUsingBSPrecise(double num) {
        double result = -1.0;
        int start = 0;
        double end = num;

        double mid = start + (end - start) / 2.0;

        while (start <= end) {
            mid = start + (end - start) / 2.0;
            double midSquared = mid * mid;

            if (Math.abs(midSquared - num) < 1e-9) {  // Use a small epsilon for precision
                return mid;
            } else if (midSquared < num) {
                result = mid;
                start = (int) (mid + 1);
            } else {
                end = mid - 1;
            }
        }
        return result;
    }


    static int findSqrtUsingLinearSearch(int num) {
        int y = 0;

        while (y * y <= num) {
            y++;
        }

        return y - 1;
    }
}
