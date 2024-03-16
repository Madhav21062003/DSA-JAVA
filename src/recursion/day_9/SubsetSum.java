package recursion.day_9;

public class SubsetSum {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int sum = 0;
        print(arr,0, arr.length, sum);

    }

    static void print(int[] arr, int index, int n, int sum){
        if (index == n) {
            System.out.print(sum + " ");
            return;
        }

        // Not included
        print(arr,index+1,n,sum);

        // included
        print(arr,index+1,n,sum+arr[index]);
    }

}
