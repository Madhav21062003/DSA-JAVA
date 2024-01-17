package online_platform_problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Leetcode 9
        int num  = sc.nextInt();
        int x = num;
        int ans = 0, rem;

        if (x < 0){
            System.out.println("Not Palindrome");
        } else if (x >= 0 && x <= 9) {
            System.out.println("Palindrome");
        }
        else {
            while (x != 0) {
                rem = x % 10;
                ans = ans * 10 + rem;
                x = x / 10;
            }
            if (ans == num)
                System.out.println("Palindrome");
            else
                System.out.println("Not Palindrome");
        }
    }
}
