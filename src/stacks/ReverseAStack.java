package stacks;

import java.util.Stack;

public class ReverseAStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        reverseStack(s);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

    static void pushAtBottom(int data, Stack<Integer> s){

        if (s.isEmpty()){
            s.push(data);
            return;
        }

        //  Remove the top element
        int top = s.pop();
        pushAtBottom(data,s);

        // fill the previously popped elements into the stack
        s.push(top);
    }

    static void reverseStack(Stack<Integer>s){

        if (s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(top,s);
    }
}
