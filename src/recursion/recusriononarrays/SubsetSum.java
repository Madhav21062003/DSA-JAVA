package recursion.recusriononarrays;

public class SubsetSum {
    public static void main(String[] args) {

        int[] a = {2,4,5};
        sunsetSum(a, a.length, 0,0);
    }

    static void sunsetSum(int[]a, int n, int idx, int sum){

        // base case
        if (idx >= n){
            System.out.print(sum+" ");
            return;
        }

        // case -1 curr idx + sum
            sunsetSum(a, n, idx + 1, sum + a[idx]);

        // case -2 ans
            sunsetSum(a, n, idx+1, sum);
    }
}
