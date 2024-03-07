package recursion.day_4;

public class FindGCD {
    public static void main(String[] args) {

        System.out.println(gcd(18,48));
    }

    static int gcd(int a, int b){
        if (b == 0)
            return a;

        return gcd(b, a % b);
    }
}
