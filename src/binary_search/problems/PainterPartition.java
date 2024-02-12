package binary_search.problems;

public class PainterPartition {
    public static void main(String[] args) {

    }

    static boolean isPossible(long mid, int[] arr, int n, int k){
        int noOfPainters = 1;
        int sum = arr[0];

        for(int i=1; i<n; i++){
            if(sum+arr[i] <= mid){
                sum += arr[i];
            }
            else{
                noOfPainters++;
                sum = arr[i];
            }
        }
        if(noOfPainters <= k){
            return true;
        }
        else
            return false;
    }
    static long minTime(int[] arr,int n,int k){
        //code here
        // return minimum time
        long maxValue = 0;
        long sum = 0;
        // Find MaxValue and sum of the array as starting and ending point
        for(int i=0; i<n; i++){
            sum += arr[i];
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }

        long start = maxValue;
        long end = sum;

        long answer = end;
        while(start <= end){
            long mid = (start + end)/2l;

            if(isPossible(mid, arr, n, k) == true){
                // goto left side
                answer = Math.min(answer,mid);
                end = mid - 1;
            }
            else{
                // goto right side
                start = mid + 1;
            }
        }
        return answer;
    }
}
