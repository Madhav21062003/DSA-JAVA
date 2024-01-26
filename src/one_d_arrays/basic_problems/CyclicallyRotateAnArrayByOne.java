package one_d_arrays.basic_problems;

public class CyclicallyRotateAnArrayByOne {
    public static void main(String[] args) {


        int arr[] = {1, 2, 3, 4, 5};  // Rotating Array By one
        System.out.println(arr[arr.length-1]);
        rotate(arr,5);

    }

    public static void rotate(int arr[], int n)
    {
        int temp = arr[n-1];

        for (int i = n-2; i >=0 ; i--) {
             arr[i+1] = arr[i];
        }
        arr[0] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
