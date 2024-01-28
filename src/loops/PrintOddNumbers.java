package loops;

import java.util.Scanner;

public class PrintOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Display only the odd Number as output
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if ( i % 2 != 0)
                System.out.print(i+" ");
        }
    }
}
