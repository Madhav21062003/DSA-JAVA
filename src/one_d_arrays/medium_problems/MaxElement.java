package one_d_arrays.medium_problems;

public class MaxElement {
    public static void main(String[] args) {

        int[] arr = {1,8,6,6,99,5,555} ;

        int maxElement = arr[0];

        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] > maxElement)
                maxElement = arr[i];
        }

        System.out.println(maxElement);
    }
}
