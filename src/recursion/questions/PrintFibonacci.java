package recursion.questions;

import java.util.Scanner;

public class PrintFibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fibonacci number till you want to print the series: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(printFibonacci(i)+" ");
        }

    }

    static int printFibonacci(int n){
        if (n==0 || n==1)
            return n;

        return printFibonacci(n-1) + printFibonacci(n-2);
    }
}
