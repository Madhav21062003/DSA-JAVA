package one_d_arrays.problemsPart3;

public class SortByParity {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};

        sortByParity(arr);
        printArray(arr);
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i] ;
        arr[i] = arr[j];
        arr[j] = temp ;
    }

    static void sortByParity(int[] arr){
        
        int left = 0;
        int right = arr.length-1;
        while (left < right){
            
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0){
                swap(arr, left, right);
                left++;
                right--;
            }

            if (arr[left] % 2 == 0)
                left++;

            if (arr[right] % 2 == 1)
                right--;
        }
    }

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
