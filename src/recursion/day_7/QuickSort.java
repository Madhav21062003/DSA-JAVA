package recursion.day_7;

public class QuickSort {
    public static void main(String[] args) {

        int[] arr = {10,3,4,1,5,6,3,2,11,9};
        quickSort(arr,0, arr.length-1);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    static void quickSort(int[] arr, int start, int end){

        // Base Case
        if (start >= end)
            return;

        // find the pivot element in the array
        int pivot = partition(arr, start, end);

        // Left Side
        quickSort(arr,start,pivot-1);

        // Right side
        quickSort(arr,pivot+1,end);
    }

    static int partition(int[] arr, int start, int end){
        int pos = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] <= arr[end]){
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;

                pos++;
            }
        }
        return pos-1;
    }
}
