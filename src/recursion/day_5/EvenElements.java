package recursion.day_5;

public class EvenElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        evenElements(arr,0);
    }

    static void evenElements(int[] arr, int idx){
        if (idx > arr.length-1)
            return;

        if (arr[idx] % 2 == 0)
            System.out.print(arr[idx]+" ");

        evenElements(arr, idx+1);

    }
}
