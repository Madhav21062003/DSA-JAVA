package one_d_arrays.hard_problems;

public class TrappingRainWater {
    public static void main(String[] args) {

        int[] height = {4,2,0,6,3,2,5};
        int totalWaterTrapped = trappedRainWater(height);
        System.out.println("Total Amount of water trapped between the buildings are = "+totalWaterTrapped);
        System.out.println("Total Amount of water trapped between the buildings are = "+trap(height));
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

    // Optimised approach without Using Extra space
    public static int trap(int[] height) {
        int n = height.length;
        int leftMax = 0, rightMax = 0, maxHeight = height[0], index = 0;
        int water = 0;

        // Step - 1 Find the Max Height of the building
        for(int i=1; i<n; i++){
            if(maxHeight < height[i]){
                maxHeight = height[i];
                index = i;
            }
        }
        // Step - 2 Solve the Left Part
        for(int i=0; i<index; i++){
            if(leftMax > height[i])
                water += leftMax - height[i];
            else
                leftMax = height[i];
        }

        // Step - 3 solve the right part
        for(int i=n-1; i>index; i--){
            if(rightMax > height[i])
                water += rightMax - height[i];
            else
                rightMax = height[i];
        }
        return water;
    }
}
