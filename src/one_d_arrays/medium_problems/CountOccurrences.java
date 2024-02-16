package one_d_arrays.medium_problems;

import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n] ;

        System.out.println("Enter the array elements");
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element");
        int x = sc.nextInt();

        System.out.println("The number of Occurrence of "+ x + " is ");
        System.out.println(countOccurrences(arr, x));

    }

    static int countOccurrences(int[] arr, int x){

        int count = 0 ;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == x)
                count++ ;
        }
        return count ;
    }
}
