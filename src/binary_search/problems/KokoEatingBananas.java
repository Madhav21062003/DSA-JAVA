package binary_search.problems;

import java.util.Arrays;

public class KokoEatingBananas {
    public static void main(String[] args) {

        int[] piles = {3,6,7,11};
        int h = 8;
        int ans = minEatingSpeed(piles, h);
        System.out.println(ans);
    }

    // link - https://leetcode.com/problems/koko-eating-bananas/description/   problem no. = 875

    public static int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int n = piles.length;
        long start = 0, end = 0 , mid, ans = 0;
        long sum = 0;
        for(int i=0; i<n; i++){
            sum = sum + piles[i];
            end = Math.max(end, piles[i]);
        }
        if (sum <= h) // If total bananas can be eaten within hours available
            return 1;

        // Adjusted start to handle case when sum > h
        start = sum / h + (sum % h == 0 ? 0 : 1);

        while(start <= end){
            mid = start + (end - start) / 2;
            // mid amount of bananas that koku can eat in one hour
            long totalTime = 0;
            for(int i=0; i<n; i++){
                totalTime = totalTime +  piles[i] / mid ;
                if(piles[i] % mid !=0  )
                    totalTime++;
            }
            if(totalTime > h){
                start = mid + 1;
            }
            else {
                ans = mid ;
                end = mid -1;
            }
        }
        return  (int)ans;
    }
}
