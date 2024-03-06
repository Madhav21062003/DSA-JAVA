package recursion.day_3;

public class PowerOf4 {
    public static void main(String[] args) {

        int res = powerOf4(2);
        System.out.println(res);
    }

    private static int powerOf4(int n) {
        if (n == 0)
            return 1;

        return 4 * powerOf4(n-1);
    }
}
