package sorting;

public class RadixSort {
    public static void main(String[] args) {

        int[] arr = {43, 453, 626, 894, 0, 3};
        radixSort(arr);
        System.out.println("The Sorted Array is: ");
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

    static void countSort(int[] arr, int place){
        int n = arr.length;
        int[] output = new int[n];

        int[] frequencyArray = new int[10];

        // Make frequency array
        for (int i = 0; i < n; i++) {
            frequencyArray[(arr[i]/place) % 10]++;
        }

        // Make prefix sum array of frequency array
        for (int i = 1; i < frequencyArray.length; i++) {
            frequencyArray[i] += frequencyArray[i-1];
        }

        // find the index of the original array  and put it into the output array
        for (int i = n-1; i >= 0; i--) {
            int idx = frequencyArray[(arr[i]/place) % 10] - 1 ;
            output[idx] = arr[i];
            frequencyArray[(arr[i]/place) % 10]--;
        }

        // copy all elements of output to arr
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    static void radixSort(int[] arr){
        int max = findMax(arr); // get maximum element

        for (int place = 1; max / place > 0 ; place = place * 10) {
            countSort(arr, place);
        }
    }

    static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}
