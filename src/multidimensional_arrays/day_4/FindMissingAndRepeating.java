package multidimensional_arrays.day_4;

import java.util.Arrays;

public class FindMissingAndRepeating {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1,2,7,6};
        int[] arr_1 = {1,2,3,4,5,6,6};
        findRepeatingAndMissingNumber(arr);
    }

    // Bruteforce approach using extra space
    static void findRepeatingAndMissingNumber(int[] arr){
        int n = arr.length;
        int[] count = new int[n];
        for (int i = 0; i < n; i++) {
            count[arr[i] - 1]++;
        }

        // Find missing number
        for (int i = 0; i < n; i++) {
            if (count[i] == 0) {
                System.out.print("Missing Number is = ");
                System.out.print(+i + 1);
                break;
            }
        }
        System.out.println();

        // find repeating Number
        for (int i = 0; i < n; i++) {
            if (count[i] == 2){
                System.out.print("Repeating Number is = ");
                System.out.print(i+1);
                break;
            }
        }
    }
}
