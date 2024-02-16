package one_d_arrays.medium_problems;

public class PrintPositiveValues {
    public static void main(String[] args) {

        int[] arr = {2, 6, -5, -1, 0, 4, -9} ;
        System.out.print("The Positive values of the arrays are =>  ");
        printPositiveValues(arr);
    }

    static void printPositiveValues(int[] arr){

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] >= 0)
                System.out.print(arr[i]+" ");
        }
    }
}
