package stacks.day_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class GetMinimumAtTop {
    public static void main(String[] args) {


    }

    //Function to push all the elements into the stack.
    public static Stack<Integer> _push(int arr[], int n)
    {
        // your code here
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){

            if(i == 0)
                st.push(arr[i]);

            else {
                st.push(Math.min(arr[i], st.peek()));
            }
        }
        return st;
    }

    //Function to print minimum value in stack each time while popping.
    static void _getMinAtPop(Stack<Integer>s)
    {
        // your code here
        while(!s.empty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
}
