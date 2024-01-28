package loops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the Nth fibonacci number using Loops
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println(n); ;
        } else {
            int prev = 0;
            int curr = 1;
            int result = 0;
            for (int i = 2; i <= n; i++) {
                result = prev + curr;
                prev = curr;
                curr = result;
            }
            System.out.println(result);
        }
    }
}
