package online_platform_problems;

public class ComplementOfNumber {
    public static void main(String[] args) {
        int ans = 0, mul =1, rem;
        int n = 14;

        while (n != 0){
            rem = n % 2;
            rem = rem ^ 1;
            n = n / 2;
             ans = ans + rem * mul;
             mul = mul * 2;
        }

        System.out.println(ans);
    }
}
