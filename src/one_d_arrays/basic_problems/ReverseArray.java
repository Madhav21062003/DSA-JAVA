package one_d_arrays.basic_problems;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int []temp = reverseArr(arr);
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i]+" ");
        }

    }

//    Reverse the array element without using extra space
    static int[] reverseArr(int[]arr){
        int j = 0;
        int temp;
        for (int i = arr.length-1; i >0 ; i--) {
            if (i > j){
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
        return arr;
    }
}
