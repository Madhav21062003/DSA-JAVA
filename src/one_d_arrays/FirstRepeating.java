package one_d_arrays;

public class FirstRepeating {
    public static void main(String[] args) {

        int[] arr = {1,5,3,4,6,33,14,3};
        int result = firstRepeating(arr);

        if (result != -1)
        System.out.println("The first repeating number is = "+result);

        else
            System.out.println("There no first repeating number in the array");
    }

    static int firstRepeating(int[] arr){
        int n =arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1 ;
    }
}
