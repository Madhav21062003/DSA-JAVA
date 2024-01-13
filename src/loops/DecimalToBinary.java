package loops;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Decimal Number: ");
        int num = sc.nextInt();

        int rem, ans = 0, mul = 1;

        while (num > 0){
            rem = num % 2;  //Getting Remainder
            num = num / 2;  // Getting Quotient
            ans = rem * mul + ans;  // Calc ans
            mul = mul * 10;   // Update power of 10
        }

        System.out.println("Your Binary Number is: "+ans);


    }
}
