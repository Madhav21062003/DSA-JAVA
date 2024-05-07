package stacks.day_3;

import java.util.Stack;

public class LargestRectangleInHistogram {
    public static void main(String[] args) {

        int[] height = {2,3,4,2,6,5,4,5,3};


        System.out.println(largestHistogram(height));

    }

    // Brute force Approach
    static int largestHistogram(int[]height){
        int n = height.length;
        int[] right = new int[n];
        int[] left = new int[n];

        Stack<Integer> st = new Stack<>();

        // Next Smallest Right
        for (int i = 0; i < n; i++) {

            // finding Right Smallest Index
            while (!st.empty() && height[st.peek()] > height[i]){
                right[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }
        while (!st.empty()){
            right[st.peek()] = n;
            st.pop();
        }

        // Next Smallest Left
        for (int i = n-1; i >=0 ; i--) {
            while (!st.empty() && height[st.peek()] > height[i]){
                left[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }
        while (!st.empty()){
            left[st.peek()] = -1;
            st.pop();
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, height[i]*(right[i] - left[i]-1));
        }

        return ans;
    }

}
