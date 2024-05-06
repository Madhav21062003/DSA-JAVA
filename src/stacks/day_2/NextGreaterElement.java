package stacks.day_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {

        int[] arr = {8, 6, 4, 7, 4, 9, 10, 8, 12};
        int n = arr.length; // size of the array list

        nextGreaterElement(arr, n);

    }

    // Brute Force approach O(n^2)
    static void nextGreaterElement(int[] arr, int n) {

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (arr[j] > arr[i]) {
                    ans[i] = arr[j];
                    break;
                }
            }
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    // Optimized Approach O(n) using stack
    public static long[] nextLargerElement(long[] arr, int n) {
        // Your code here
        long[] ans = new long[n];

        for (int i = 0; i < n; i++) {
            ans[i] = -1;
        }

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            // if(st.empty())
            //     st.push(i);

            // else {
            while (!st.empty() && arr[st.peek()] < arr[i]) {
                ans[st.peek()] = arr[i];
                st.pop();
            }
            st.push(i);
            // }
        }
        return ans;
    }
}
