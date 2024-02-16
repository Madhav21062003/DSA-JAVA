package one_d_arrays.hard_problems;

public class TrappingRainWater {
    public static void main(String[] args) {

        int[] height = {4,2,0,6,3,2,5};
        int totalWaterTrapped = trappedRainWater(height);
        System.out.println("Total Amount of water trapped between the buildings are = "+totalWaterTrapped);
    }

    static int trappedRainWater(int[] height){
        int n = height.length;

        // Calculate Left max boundary
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        // Calculate Right max boundary
        int[] rightMax = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i = n-2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        // loop
        int trappedWater = 0 ;
        for (int i = 0; i < n; i++) {
            // waterLevel = min(Left max boundary, Right max boundary)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // Trapped water = waterLevel - height[i]
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
}
