package stacks.day_1;

import java.util.ArrayList;
import java.util.Stack;

public class ReverseArrayByStack {
    public static void main(String[] args) {


        char[] arr = {'h', 'e', 'l', 'l', 'o'};

        Stack<Character> st = new Stack<>();

        // Push the values of array into the stack
        for (int i = 0; i < arr.length; i++) {
            st.push(arr[i]);
        }

        int i = 0;
        // Put the values of stack into the array by popping values from stack
        while (!st.empty()) {
            arr[i] = st.peek();
            i++;
            st.pop();
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }


    }
}
