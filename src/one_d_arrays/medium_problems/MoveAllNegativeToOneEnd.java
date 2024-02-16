package one_d_arrays.medium_problems;

public class MoveAllNegativeToOneEnd {
    public static void main(String[] args) {


        /*
* Q1 - Given an unsorted array arr[] of size N having both negative and positive integers, place
all negative elements at the end of array without changing the order of positive elements
and negative elements.

Input :
N = 8
arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
Output :
1 3 2 11 6 -1 -7 -5
        * */


        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6 };
        int n = arr.length;

        int[] ans = new int[n] ;
        int idx = 0  ;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0){
                ans[idx] = arr[i];
                idx++ ;
            }
        }
        System.out.println(idx);

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0){
                ans[idx] = arr[i];
                idx++ ;
            }
        }
        System.out.println(idx);
        arr = ans ;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}
