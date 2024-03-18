package recursion.day_10;

public class TargetSumRepetition {
    public static void main(String[] args) {

        int[] arr = {2,3,4};
        System.out.println(subsetSum(arr,0, arr.length, 6));
    }


    static int subsetSum(int[] arr, int idx,int n, int sum){

        if (sum == 0)
            return 1;

        if (idx == n || sum < 0)
            return 0;


        return subsetSum(arr,idx+1,n,sum) + subsetSum(arr,idx,n,sum-arr[idx]);
    }
}
