package recursion.day_5;

public class PrintArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3};
        printArr(arr, 0);
        System.out.println();
        revArr(arr, arr.length-1);
    }

    static void printArr(int[] arr, int idx){
        if (idx == arr.length)
            return;

        System.out.print(arr[idx]+" ");
        printArr(arr,idx+1);
    }

    // Reverse Array
    static void revArr(int[] arr, int idx){
        if (idx < 0)
            return;

        revArr(arr, idx - 1);
        System.out.print(arr[idx]+" ");
    }
}
