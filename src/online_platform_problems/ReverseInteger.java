package online_platform_problems;

public class ReverseInteger {
    public static void main(String[] args) {
        // Leetcode 7
        int res = reverse(-321);
        System.out.println(res);
    }

    private static int reverse(int x) {

        // Take the absolute value of x
        int num = Math.abs(x);

        int rev = 0, rem ;

        while (num != 0){
            rem = num % 10;

            // Check the Overflow if occur return 0
            if (rev > (Integer.MAX_VALUE - rem) / 10)
                return 0;

            rev = rev * 10 + rem;
            num = num / 10;
        }

        // Give the answer according to Sign
        return (x<0)? (-rev) : rev;
    }
}
