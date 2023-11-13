package stacks;

import java.util.Stack;

public class BasicOfStacks {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println("The top most element of the stack is = "+st.peek());

        System.out.println("The all Elements in the Stack are = "+st);

        st.pop();
        System.out.println("Removing the top  most element "+st);
        System.out.println(st.size());  
        
    }
}
