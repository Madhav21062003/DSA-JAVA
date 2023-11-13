package multidimensional_arrays;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        
        Scanner scanner  = new Scanner(System.in);
        // Taking User Input In 2-D Array

        System.out.println("Enter Dimension of Matrix 1 ");
        System.out.print("Enter the number of rows: ");
        int rows1 = scanner.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int columns1 = scanner.nextInt();

        int[][] matrix1 = new int[rows1][columns1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter Dimension of Matrix 2 ");
         System.out.print("Enter the number of rows: ");
        int rows2 = scanner.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int columns2 = scanner.nextInt();

       
        int[][] matrix2 = new int[rows2][columns2];
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix2[i][j] = scanner.nextInt();
            }
        }

        multiplyMatrix(matrix1, rows1, columns1, matrix2, rows2, columns2);
    }

    static void multiplyMatrix(int[][]arr1, int r1, int c1, int[][]arr2, int r2, int c2){
        int[][] multiply = new int[r1][c2];
        
       if (c1 != r2) {
        System.out.println("Multiplication not possible");
        return;
       }else{
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k< r2; k++) {
                    multiply[i][j] += arr1[i][k] * arr2[k][j];
                }
                System.out.println();
            }
        }
       }
       System.out.println("The Multiplication  of the arrays is");
       printArray(multiply);
    }

    static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
