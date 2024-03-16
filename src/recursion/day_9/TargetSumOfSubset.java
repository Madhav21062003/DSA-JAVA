package recursion.day_9;

public class TargetSumOfSubset {
    public static void main(String[] args) {
        int[] arr = {3,4,6,5};
        int target = 12;
       boolean ans = find(arr,0,arr.length,target);
        System.out.println(ans);
    }

    private static boolean find(int[] arr, int idx, int n, int target) {

        // Base case
        if (target == 0)
            return true;

        if (idx == n || target < 0)
            return false;


        return find(arr,idx+1,n,target) || find(arr,idx+1,n,target-arr[idx]);
    }
}
