package one_d_arrays.medium_problems.problemspart4;

public class CheckEqualityOfPrefixAndSuffixSum {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1};
        System.out.println(equalPartion(arr));
    }
    static int findArraySum(int[] arr){
        int n = arr.length;
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            totalSum = totalSum + arr[i];
        }
        return totalSum;
    }

    static boolean equalPartion(int[] arr){
        int totalSum = findArraySum(arr);
        int preSum = 0;

        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];
            int sufixSum = totalSum - preSum;
            if (sufixSum == preSum){
                return true;
            }
        }
        return false;
    }
}
