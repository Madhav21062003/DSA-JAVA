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


        // Write a program to convert decimal numbers to Octal numbers.

        // Write a program to convert Octal numbers to decimal numbers.

        // Write a program to convert binary to Octal numbers

        // Write a program to convert Octal numbers to binary numbers
    }
}
