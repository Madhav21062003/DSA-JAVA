package recursion.day_4;

public class FibonacciUptoN {
    public static void main(String[] args) {

    }

    int[] Series(int N) {
        // code here

        int[] arr = new int[N+1];

        fib(arr,N+1,0);
        return arr;

    }

    static int[] fib(int[] arr,int N,int ind){
        //base case
        if(ind >= N){
            return arr;
        }

        if (ind == 0) {
            arr[ind] = 0;
        } else if (ind == 1) {
            arr[ind] = 1;
        } else {
            arr[ind] = arr[ind - 1] + arr[ind - 2];
        }


        return fib(arr,N,ind+1);

    }
}
