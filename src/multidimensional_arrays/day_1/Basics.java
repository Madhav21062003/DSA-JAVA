package multidimensional_arrays.day_1;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Initializing an array
        int[][] arr = new int[2][3];

        // Declaration of 2-D Array2
        int[][]  arr1 = {
                {1,5,6},
                {2,9,8},
                {7,3,4}
        };



        // Taking User Input In 2-D Array
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Giving Number of rows at compile time is mandatory but columns can be optional
        int[][] twoDArray = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                twoDArray[i][j] = scanner.nextInt();
            }
        }
        printArray(twoDArray);


    }

    static void printArray(int[][] arr){
        // printing 2-D Array
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
