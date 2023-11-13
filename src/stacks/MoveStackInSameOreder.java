package stacks;

import java.util.Stack;

public class MoveStackInSameOreder {
    public static void main(String[] args) {
        
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println(st);

        // Reverse Order
        Stack<Integer> st2 = new Stack<>();
        
        while (st.size() > 0) {
            st2.push(st.pop());
        }

        // System.out.println(st2);

        Stack<Integer> st3 = new Stack<>();
        while (st2.size() > 0) {
            st3.push(st2.pop());
        }
        System.out.println(st3);
    }
}
