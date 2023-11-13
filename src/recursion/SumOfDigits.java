package recursion;

public class SumOfDigits {
    public static void main(String[] args) {

        System.out.println("Sum of given Digits = "+sumOfDigits(4));
    }

    static int sumOfDigits(int n){

        if (n>=0 && n<=9)
            return n;

        int lastDigit = n % 10;
        return lastDigit + sumOfDigits(n / 10);
    }
}
