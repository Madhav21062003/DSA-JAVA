package conditionals;

import java.util.Scanner;


// Calculate ticket prices
public class TicketPriceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();

        if (age < 12 || age > 65)
            System.out.println("Eligible for discount");
        else
            System.out.println("Not Eligible for discount");

    }
}
