package loops;

import java.util.Scanner;

public class PrintNumberInReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Here we print the reverse of the given number
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        for (int i = n; i > 0 ; i--) {
            System.out.print(i+" ");
        }
    }
}
