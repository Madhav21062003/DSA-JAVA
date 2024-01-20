package homework;

public class HomeworkDay16 {
    public static void main(String[] args) {

        // Write a program to convert binary numbers to decimal numbers using a for loop.
            int rem, ans =0, mul = 1, n = 111;
            while (n != 0){
                rem = n % 2;
                n = n / 10;
                ans = ans + rem * mul;
                mul = mul * 2;
            }
        System.out.println(ans);

        // Write a program to convert decimal numbers to binary numbers using a for loop.
            int ans_1 = 0, mul_1 = 1;
            int n_1 = 7;
            while (n_1 != 0){
                rem = n_1 % 2;
                n_1 = n_1 / 2;
                ans_1 = ans_1 + rem*mul_1;
                mul_1 = mul_1 * 10;
            }
        System.out.println(ans_1);

        // Write a program to convert decimal numbers to Octal numbers.

        // Write a program to convert Octal numbers to decimal numbers.

        // Write a program to convert binary to Octal numbers

        // Write a program to convert Octal numbers to binary numbers
    }
}
