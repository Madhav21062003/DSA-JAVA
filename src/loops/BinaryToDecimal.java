package loops;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary Number: ");
        int num = sc.nextInt();

        int rem, ans = 0, mul = 1;

        while (num > 0){
            rem = num % 10;  //Getting Remainder  to get 1 or 0
            num = num / 10;  // Getting Quotient
            ans = rem * mul + ans;  // Calc ans
            mul = mul * 2;   // Update power of 10
        }
        System.out.println("Your Decimal Number is: "+ans);
    }
}
