package recursion.day_3;

public class SquareOfNNumber {
    public static void main(String[] args) {
        int res = squareSum(3);
        System.out.println(res);
    }

    static int squareSum(int n ){
        if (n == 0)
            return 0;

        return (n*n) + squareSum(n-1);
    }
}
