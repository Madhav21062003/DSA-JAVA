package conditionals;

import java.util.Scanner;

public class CompareTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = sc.nextInt();

        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();

        if (a > b)
            System.out.println("The bigger Number is =  "+a);
        else if (a == b) {
            System.out.println("Numbers are same");
        }
        else
            System.out.println("The bigger Number is =  "+b);

    }
}
