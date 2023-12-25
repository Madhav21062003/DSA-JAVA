package loops;

import java.util.Scanner;

public class PrintDivisibles {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i % 4 == 0)
                System.out.print(i+" ");
        }
    }
}
