package multidimensional_arrays;

import java.util.Scanner;

public class SumOfMatrix {
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

        addMatrices(matrix1, rows1, columns1, matrix2, rows2, columns2);
     
    }

    static void addMatrices(int[][]a, int r1, int c1, int[][]b, int r2, int c2){

        int[][] totalSum = new int[r1][c1];
        if (r1 != r2 || c1 != c2) {
            System.out.println("Enter valid Dimemsions");
            return;
        }else{
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    totalSum[i][j] = a[i][j] + b[i][j];
                }
            }
            System.out.println("The Total sum of the arrays is");
            printArray(totalSum);
        }
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
