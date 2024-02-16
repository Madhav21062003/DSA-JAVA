package one_d_arrays.medium_problems.problemsPart3;

public class Sort0And1 {
    public static void main(String[] args) {

        int[] arr = {1,0,1,0,1,0,1};
//        sortZeroesAndOnes(arr);
        sortZeroAndOnes(arr);
        printArray(arr);
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i] ;
        arr[i] = arr[j];
        arr[j] = temp ;
    }

    // Bruteforce approach
    static  void sortZeroesAndOnes(int[] arr){
        int n = arr.length;
        int zeroes = 0 ;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                zeroes++ ;
        }

        for (int i = 0; i < n; i++) {
            if (i < zeroes)
                arr[i] = 0 ;
            else
                arr[i] = 1 ;
        }
    }

    // using Two pointer approach
    static void sortZeroAndOnes(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            if (arr[start] == 1 && arr[end] == 0) {
                swap(arr, start, end);

                start++;
                end--;
            }

            if (arr[start] == 0)
                start++ ;
            if (arr[end] == 1)
                end--;
        }
    }

    static void  printArray(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
