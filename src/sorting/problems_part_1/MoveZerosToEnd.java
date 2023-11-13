package sorting.problems_part_1;

public class MoveZerosToEnd {
    public static void main(String[] args) {

        int[] arr = {1, 10, 0, 0, 5, 6};
        moveZerosToEnd(arr);
        for (int val:arr) {
            System.out.print(val+" ");
        }
    }

    static void  moveZerosToEnd(int[]arr){
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] == 0 && arr[j+1] != 0){
                    // swap arr[j], arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
