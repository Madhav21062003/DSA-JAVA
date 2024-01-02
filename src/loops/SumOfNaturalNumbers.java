package loops;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range ot Natural Number: ");
        int n = sc.nextInt();

        int res = n*(n+1) / 2 ;

        System.out.println(res);

        // Using Loops
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i ;
        }
        System.out.println(sum);
    }
}
