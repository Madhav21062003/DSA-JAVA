package one_d_arrays;

public class PrintMinimumValue {
    public static void main(String[] args) {

        int[] arr = {2, -3, 5, 8, 1, 0, -4};
        System.out.println("The minimum Value of the array is");
        System.out.println(printMinimumValue(arr));
    }

    static int printMinimumValue(int[] arr){
        int minimumValue = Integer.MAX_VALUE ;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] < minimumValue)
                minimumValue = arr[i] ;
        }
        return minimumValue ;
    }
}
