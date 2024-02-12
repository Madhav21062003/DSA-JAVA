package binary_search.problems;

import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {

        int[] stalls = {10,1,2,7,5};
        int n = 5, k = 3;
        int ans = solve(n, k, stalls);
        System.out.println(ans);
    }

    // link -  https://www.geeksforgeeks.org/problems/aggressive-cows/0

    public static int solve(int n, int k, int[] stalls) {
        Arrays.sort(stalls);
        int start = 1, end, mid , ans = -1;
        end = stalls[n-1] - stalls[0];

        while(start <= end ){
            mid = start + (end - start) / 2 ;

            int count = 1, pos = stalls[0];

            for(int i=1; i<n; i++){
                if(pos + mid <= stalls[i]){
                    count++;
                    pos = stalls[i];
                }
            }

            if(count < k)
                end = mid -1 ;

            else {
                ans = mid;
                start = mid + 1;
            }
        }
        return ans;
    }
}
