package loops;

import java.util.Scanner;

public class APowerB {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number and it's Power:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = 1;
        for (int i = 1; i <= b; i++) {
            res = res * a;
        }

        System.out.println(res);
    }
}
