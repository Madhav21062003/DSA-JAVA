package functions;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean result = armstrongNum(153);
        System.out.println(result);
        System.out.println(armstrongNum(154));
    }

    static boolean armstrongNum(int num){
        int rem;
        int sum = 0;
        int x = num;

    // armstrong number 
        while (x != 0){
            rem = x % 10;
            x = x / 10;
            sum = sum + (rem*rem*rem);
        }
        if (sum == num)
            return true;
        else
            return false;
    }
}
