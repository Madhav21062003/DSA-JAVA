package recursion.day_10;

public class PerfectSumProblem {
    public static void main(String[] args) {

        int[] arr = {2, 5, 6, 1, 3, 2};
        int[] arr_1 = {1, 0};
        int sum = 8;
        System.out.println(subset(arr, 0, sum, arr.length));
    }

    static int subset(int[] arr, int idx, int sum, int n) {

        if (idx == n) {
            if (sum == 0)
                return 1;
            else
                return 0;
        }
        return subset(arr, idx + 1, sum, n) + subset(arr, idx + 1, sum - arr[idx], n);
    }
}
