package one_d_arrays.medium_problems;

public class PrintSubArrays {
    public static void main(String[] args) {
        int arr[] = { 10, 2, 3, 99, 12, 0 };
        System.out.println("The subarrays are-");
        printSubArrays(arr);
    }

    static void printSubArrays(int[] arr){
        // For loop for start index
        for (int i = 0; i < arr.length; i++)

            // For loop for end index
            for (int j = i; j < arr.length; j++) {

                // For loop to print subarray elements
                for (int k = i; k <=j; k++)
                    System.out.print(arr[k] + " ");
                System.out.println("");
            }
    }
}

