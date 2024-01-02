package loops;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check it is Prime or Not:");
        int n = sc.nextInt();

        if ( n < 2)
            System.out.println("Not Prime");

        else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.println("Not Prime");
                    return;
                }
            }
            System.out.println("Prime");
        }
    }
}
