package recursion.recusriononarrays;

public class PrintArrayIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        printArr(arr, 0);
    }

    static void printArr(int[]arr, int index){
        if (index == arr.length)
            return;


        System.out.print(arr[index]+" ");
         printArr(arr, index+1);

    }
}
