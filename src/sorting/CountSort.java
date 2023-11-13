package sorting;

public class CountSort {
    public static void main(String[] args) {

        int[] arr = {1, 4, 5, 2, 2, 2, 9};
        countSort(arr);
        displayArray(arr);
    }

    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    static void basicCountSort(int[] arr) {
        int max = findMax(arr);  // find the largest element of the array
        int[] frequencyArray = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            frequencyArray[arr[i]]++;
        }

        int k = 0;
        for (int i = 0; i < frequencyArray.length; i++) {
            for (int j = 0; j < frequencyArray[i]; j++) {
                arr[k++] = i;
            }
        }
    }
// ==================================================================================================================================


    static void countSort(int[] arr){
        int n = arr.length;
        int[] output = new int[n];
        int max = findMax(arr);  // find the largest element of the array
        int[] frequencyArray = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            frequencyArray[arr[i]]++;
        }

        // Make prefix sum array of count array
        for (int i = 1; i < frequencyArray.length; i++) {
            frequencyArray[i] += frequencyArray[i-1];
        }

        // find the index of the original array  and put it into the output array
        for (int i = n-1; i >= 0; i--) {
            int idx = frequencyArray[arr[i]] - 1 ;
            output[idx] = arr[i];
            frequencyArray[arr[i]]--;
        }

        // copy all elements of output to arr
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
    static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
