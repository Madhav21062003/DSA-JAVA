package homework;

import java.util.Scanner;

public class HomeworkDay5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Q-1 Print number from 280 to 250 with the help of for loop.
        for (int i = 280; i >= 250; i--) {
            System.out.print(i+" ");
        }
        System.out.println();

        // Q-2 Print char from ‘A’ to ‘Z’ with the help of a for loop.
        for (char ch = 'A'; ch <= 'Z'; ch++){
            System.out.print(ch+" ");
        }
        System.out.println();

        // Q-3 Print char from ‘Z’ to ‘A’ with the help of a for loop.
        for (char ch = 'Z'; ch >= 'A'; ch--){
            System.out.print(ch+" ");
        }
        System.out.println();


        // Q-4 There is an Arithmetic Progression,
        // First number is 220 and Common Difference is 7.
        // So print all the numbers from 220 to 730 which follow the AP.

        /*
        The formula for the nth term in an arithmetic progression is given by:
         an = a1 + (n-1) * d
         where an = is the nth term
         a1 = first term
         d  = common difference
          n =te term number
        */

        // Given values
        int firstNumber = 220;
        int commonDifference = 7;
        int lastNumber = 730;
        for (int i = firstNumber; i <= lastNumber; i += commonDifference) {
            System.out.print(i + " ");
        }
        System.out.println();


        // Q-5 Print Sum of square of first n natural number.
        int n = 3;
        int sumOfSquares = 0 ;
        for (int i = 1; i <= n; i++) {
            int cube = i*i;
            sumOfSquares = sumOfSquares + cube;
        }
        System.out.println("Sum of square of first n natural number "+sumOfSquares);

        // Q-6 Print Sum of cube of first n natural number

        int sumOfCube = 0 ;
        for (int i = 1; i <= n; i++) {
            int cube = i*i*i;
            sumOfCube = sumOfCube + cube;
        }
        System.out.println("Sum of cube of first n natural number "+sumOfCube);

        // Q-7 Print n’th Fibonacci number.
        System.out.println("Enter the number");
        int num = sc.nextInt();

        if (num <= 1)
            System.out.println(n);

        else {
            int prev = 0;
            int curr = 1;
            int result = 0;
            for (int i =2; i <= num; i++){
                result = prev + curr;
                prev = curr;
                curr = result;
            }
            System.out.println(result);
        }


    }
}
