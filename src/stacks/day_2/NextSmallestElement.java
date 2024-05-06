package stacks.day_2;

import java.util.Stack;

public class NextSmallestElement {
    public static void main(String[] args) {

    }

    public static int[] help_classmate(int arr[], int n)
    {
        // Your code goes here
        int[] ans = new int[n];

        for( int i = 0; i < n; i++){
            ans[i] = -1;
        }

        Stack<Integer> st = new Stack<>();

        for(int i =0; i<n; i++){

            // if(st.empty())
            //     st.push(i);

            // else {
            while(!st.empty() && arr[st.peek()] > arr[i])
            {
                ans[st.peek()] = arr[i];
                st.pop();
            }
            st.push(i);
            // }
        }


        return ans;
    }
}
