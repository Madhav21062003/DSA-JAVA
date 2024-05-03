package stacks.day_1;

import java.util.Stack;

public class InsertAtBottom {
    public static void main(String[] args) {


    }

    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {

        Stack<Integer> temp = new Stack<>();

        while (!st.empty()) {
            temp.push(st.peek());
            st.pop();
        }

        st.push(x);

        while (!temp.empty()) {
            st.push(temp.peek());
            temp.pop();
        }

        return st;

    }
}
