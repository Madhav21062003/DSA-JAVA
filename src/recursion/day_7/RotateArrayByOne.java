package recursion.day_7;

public class RotateArrayByOne {
    public static void main(String[] args) {
        // I/P = 1 2 3 4 5 6
        // O/P = 2 3 4 5 6 1
        int[] arr_1 = {1,2,3,4,5,6};
//        rotateByOneLoops(arr_1);
        System.out.println();

        rotateByOne(arr_1,1, arr_1[0]);
        for (int i = 0; i < arr_1.length; i++) {
            System.out.print(arr_1[i]+" ");
        }

    }
    static void rotateByOne(int[] arr, int idx, int temp){
        if (idx == arr.length){
            arr[idx - 1] = temp;
            return;
        }

        arr[idx-1] = arr[idx];
        rotateByOne(arr, idx+1, temp);
    }


    // Without Recursion
    static void rotateByOneLoops(int[] arr){
        int temp = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }

        arr[arr.length-1] = temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
