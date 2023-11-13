package recursion.recusriononarrays;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println("The Sum of the array Elements =  "+getSum(arr, 0));
    }

    static int getSum(int[] arr, int index){
        if (index == arr.length)
            return 0;

        // sub problem
        int smallAns  = getSum(arr, index+1);

        // self work
        return smallAns + arr[index];
    }
}
