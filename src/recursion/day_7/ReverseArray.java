package recursion.day_7;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,45,6,7,8,9};
        reverseArray(arr, arr.length-1);
    }

    static void reverseArray(int[] arr, int idx){
        if (idx == -1)
            return;
        System.out.print(arr[idx]+" ");
        reverseArray(arr,idx-1);
    }
}
