package one_d_arrays;

import java.util.Scanner;

public class lastOccurrence {
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

        System.out.println("The Last Occurrence of "+ x + " is ");
        System.out.println(lastOccurrence(arr, x));

    }

    static int lastOccurrence(int[]arr, int x){
                int lastOcc = -1 ;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == x)
                lastOcc = i ;
        }
        return lastOcc ;
    }
}
