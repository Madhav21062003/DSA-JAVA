package Queuees.interviewQuestons;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ImplementStackUsingQueue {

    Queue<Integer> q = new LinkedList<>();

    public ImplementStackUsingQueue() {

    }

    public void push(int x) {
        q.add(x);
    }

    // before - 1 2 3 4
    public int pop() {
        for(int i = 1; i <= q.size()-1; i++){
            q.add(q.remove());
        }

        // 4 1 2 3
        int val = q.peek();  // 4
        q.remove();   // remaing elements of queue - 1 2 3

        return val;
    }

    // before - 1 2 3 4
    public int top() {   // Peek Element

        for(int i=1; i<= q.size()-1; i++){
            q.add(q.remove());
        }
        // after - 4 3 2 1
        int val = q.peek();
        q.add(q.remove());

        return val;
    }

    public boolean empty() {
        if (q.size() == 0)
            return true;

        return false;
    }

    public void display(){
        Stack<Integer> stack = new Stack<>();
        while (q.size()> 0){
            stack.push(q.remove());
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }

        public static void main(String[] args) {

        ImplementStackUsingQueue st = new ImplementStackUsingQueue();
       
    }
}
