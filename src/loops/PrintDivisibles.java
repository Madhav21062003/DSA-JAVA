package loops;

import java.util.Scanner;

public class PrintDivisibles {
    public static void main(String[] args) {

        // Find the divisible of the particular number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i % 4 == 0)
                System.out.print(i+" ");
        }
    }
}
