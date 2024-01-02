package loops;

import java.util.Scanner;

public class PrintNumbersWithJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Starting Number: ");
        int start = sc.nextInt();

        System.out.print("Enter Ending Number: ");
        int end = sc.nextInt();

        System.out.print("Enter The number of jumps: ");
        int jumps = sc.nextInt();
        for (int i = start; i < end; i = i + jumps) {
            System.out.print(i+" ");
        }

    }
}
