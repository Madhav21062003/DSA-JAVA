package homework;

import java.util.Scanner;

public class HomeworkDay12 {
    public static void main(String[] args) {

        // 1: Temperature Range: Write a program that checks if a given temperature is suitable for swimming.
        //  If the temperature is between 70 and 90 (Excluded) degrees Fahrenheit print yes, else NO.
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();

        if (temp >= 70 && temp <= 90){
            System.out.println("Yes");
        }else
            System.out.println("No");

        // 2: Even and Positive Number: Write a program that prints “YES”
        // if a given number is both even and positive, otherwise it will print “NO”.

        int num = sc.nextInt();
        if (num % 2==0 && num > 0)
            System.out.println("YES");
        else
            System.out.println("NO");

        // 3: Age Check: Implement a program that checks if a person is a teenager.
        // A teenager is someone whose age is between 13 and 19 (inclusive).
        int age = sc.nextInt();
        if (age >= 13 && age <= 19)
            System.out.println("Teenager");
        else
            System.out.println("Not a Teenager");

        // 4: Take three numbers a,b,c from the user, print yes if a is either greater than b or c. Otherwise print NO.
        int a= sc.nextInt();
        int b = sc.nextInt();
        int c= sc.nextInt();

        if (a > b || a > c)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
