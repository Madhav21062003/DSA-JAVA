package recursion.day_11;

public class WaysToGetSum {
    public static void main(String[] args) {

        int[] arr = {1,5,6};
        System.out.println(way(arr,7));
    }

    static int way(int[] arr, int sum){

        if (sum == 0)
            return 1;

        if (sum < 0 )
            return 0;

        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans + way(arr,sum - arr[i]);
        }

        return ans;
    }
}
