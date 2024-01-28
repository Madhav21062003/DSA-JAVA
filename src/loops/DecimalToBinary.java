package loops;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {

//        Decimal to Binary conversion
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Decimal Number: ");
        int num = sc.nextInt();
        int num_2 = 13;
        int rem, ans = 0, mul = 1;

        while (num > 0){
            rem = num % 2;  //Getting Remainder
            num = num / 2;  // Getting Quotient
            ans = rem * mul + ans;  // Calc ans
            mul = mul * 10;   // Update power of 10
        }

        int rem_2, ans_2 = 0;

        // UsingBitwise Operator
        while (num_2 > 0){
            rem_2 = num_2 & 1; // Remainder i.e mod by  `2
            num_2 = num_2 >> 1 ;  // Quotient i.e num / 2
            ans_2 = rem_2 * mul + ans_2;
            mul = mul * 10;
        }

        System.out.println("Your Binary Number is: "+ans);
        System.out.println("Your Binary Number is: "+ans_2);


    }
}
