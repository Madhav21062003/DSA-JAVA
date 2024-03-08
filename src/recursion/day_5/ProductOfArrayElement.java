package recursion.day_5;

public class ProductOfArrayElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2};
        System.out.println(productElement(arr,0));
    }

    static int productElement(int[] arr, int idx){
        if (idx > arr.length-1)
            return 1;

        return arr[idx] * productElement(arr,idx+1);
    }
}
