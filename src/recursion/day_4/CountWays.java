package recursion.day_4;

public class CountWays {
    public static void main(String[] args) {

    }

    static long countWays(int n)
    {
        // add your code here
        int mod  = 1000000007;
        if( n < 0)
            return 0;

        if( n == 0)
            return 1;

        long ans = countWays(n-1) % mod +  countWays(n-2) % mod +  countWays(n-3) % mod;
        return ans ;
    }

}
