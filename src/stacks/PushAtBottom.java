package stacks;

import java.util.Stack;

public class PushAtBottom {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(4, s);

        while (!s.isEmpty()){
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
}
