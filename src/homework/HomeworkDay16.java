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
        int ans_2 = 0, mul_2 = 1,n_2 = 48;
        while (n_2 != 0){
            rem  = n_2 % 8;
            n_2  = n_2 / 8;
            ans_2 = ans_2 + rem * mul_2;
            mul_2 = mul_2 * 10;
        }
        System.out.println(ans_2);

        // Write a program to convert Octal numbers to decimal numbers.
        int ans_3 = 0, mul_3 = 1,n_3 = 112;
        while (n_3 != 0){
            rem  = n_3 % 10;
            n_3  = n_3 / 10;
            ans_3 = ans_3 + rem * mul_3;
            mul_3 = mul_3 * 8;
        }
        System.out.println(ans_3);

        // Write a program to convert binary to Octal numbers


        // Write a program to convert Octal numbers to binary numbers
    }
}
