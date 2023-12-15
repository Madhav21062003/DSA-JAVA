package Queuees.interviewQuestons;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue);
        Stack<Integer> st = new Stack<>();

        while (queue.size() > 0){
            st.push(queue.remove());
        }
        while (st.size() > 0){
            queue.add(st.pop());
        }

        System.out.println("Reversed Queue "+queue);
    }
}
