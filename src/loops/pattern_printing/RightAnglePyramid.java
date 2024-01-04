package loops.pattern_printing;

import java.util.Scanner;

public class RightAnglePyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        for (char i = 'a'; i <= 'e'; i++) {
            for (char j = 'a'; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j>= 5 - (i-1); j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
