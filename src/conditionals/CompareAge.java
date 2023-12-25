package conditionals;

import java.util.Scanner;

public class CompareAge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();

        if (age <= 18)
            System.out.println("You are Teenager");

        else
            System.out.println("You are Adult");
    }
}
