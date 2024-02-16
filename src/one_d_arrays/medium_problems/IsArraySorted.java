package one_d_arrays.medium_problems;

public class IsArraySorted {
    public static   void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 55, 6, 7, 8, 9};
        System.out.println(isArraySorted(arr));

        int[] arr_1 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(isArraySorted(arr_1));

    }

  static boolean isArraySorted(int[] arr) {

       boolean check = true ;
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] < arr[i-1]){
                check = false ;
                break;
            }
        }

        return check;
    }
}