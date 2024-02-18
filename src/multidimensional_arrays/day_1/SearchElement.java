package multidimensional_arrays.day_1;

import java.util.Arrays;
import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        System.out.println("Enter array elements");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int key = sc.nextInt();
        searchElement(arr,  key, r, c);

        // Printing array elements

//        System.out.println("Array elements are");
//        for (int i = 0; i < r; i++) {
//            for (int j = 0; j < c; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }

    }

    private static void searchElement(int[][] arr, int key, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(arr[i][j] == key) {
                    System.out.println("The element " + key + " is present at index " + arr[i][j]);
                    break;
                }
            }
        }
        System.out.println("No Present");

    }
}
