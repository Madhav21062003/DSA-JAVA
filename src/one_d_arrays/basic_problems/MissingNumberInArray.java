package one_d_arrays.basic_problems;

public class MissingNumberInArray {
    public static void main(String[] args) {

        int[] arr = {1,3,4,5,6};
        int[] a = {1,2,3,4,5,7};
        System.out.println("Missing Number in your array is: "+missingNumber(a,7));
    }

    static int missingNumber(int[] arr, int N){
        int missingNumber, sumOfArrayElements = 0;

        for (int i = 0; i < arr.length; i++) {
            sumOfArrayElements = sumOfArrayElements + arr[i];
        }
        int sumOfArraySize = N*(N+1) / 2 ;

        if (sumOfArraySize > sumOfArrayElements)
            missingNumber = sumOfArraySize - sumOfArrayElements;
        else
            missingNumber = sumOfArrayElements  - sumOfArraySize;

        return missingNumber;
    }
}
