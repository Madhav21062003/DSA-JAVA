package stacks.day_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class SmallestNumberOnLeft {
    public static void main(String[] args) {

        int[] a = {1, 6, 2};
        int n = 3;
        System.out.println(leftSmaller(n,a));
    }

    static List<Integer> leftSmaller(int n, int[] a)
    {
        //code here
        Stack<Integer> st = new Stack<>();
        List<Integer> ans = new ArrayList<>(Collections.nCopies(n, -1));

        for(int i = n-1; i>=0; i--){
            while(!st.empty() && a[i] < a[st.peek()]){
                ans.add(st.peek(),a[i]);
                st.pop();
            }

            st.push(i);
        }

        return ans;
    }
}
