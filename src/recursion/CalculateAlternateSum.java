package recursion;

import java.util.Scanner;

public class CalculateAlternateSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(calculateAlternateSum(n));
    }

    static int calculateAlternateSum(int n){

        if (n == 0)
            return 0;

        if (n % 2 == 0)
            return calculateAlternateSum(n-1) -n ;

        else
            return calculateAlternateSum(n-1) + n ;
    }
}
