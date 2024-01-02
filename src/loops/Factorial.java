package loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();

        if (n == 0)
            System.out.println("1");

        else if (n == 1) {
            System.out.println("1");
        }
        else {
            int res = 1;
            for (int i = n; i > 0; i--) {
                res = i * res;
            }
            System.out.println(res);
        }
    }
}
