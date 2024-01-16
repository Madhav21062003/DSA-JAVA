package online_platform_problems;

import java.util.Scanner;

public class AddDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Problem N0. 258
        System.out.println("Enter Number: ");
        int num  = sc.nextInt();

        int result = addDigits(num);
        System.out.println(result);

    }

    static int addDigits(int num){
        while ( num > 9){
            int ans = 0 , rem;

            while (num != 0){
                rem = num % 10;
                num = num / 10;
                ans = ans + rem;
            }
            num = ans;
        }
        return num;
    }
}
