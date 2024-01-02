package loops;

import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int num = sc.nextInt();

        System.out.println("Enter table length");
        int length = sc.nextInt();

        for (int i = 1; i <= length; i++) {
            int result = num * i;
            System.out.println(num+" X "+i+" = "+result);
        }
    }
}
