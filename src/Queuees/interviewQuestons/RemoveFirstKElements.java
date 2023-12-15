package Queuees.interviewQuestons;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RemoveFirstKElements {

    static Queue<Integer> queue;

    // Function to reverse the first
    // K elements of the Queue
    static void reverseQueueFirstKElements(int k){

        if (queue.isEmpty() == true || k > queue.size())
            return;

        if (k<= 0)
            return;

        Stack<Integer> stack = new Stack<>();

        // Push the First K elements into the stack
        for (int i = 0; i < k; i++) {
            stack.push(queue.peek());
            queue.remove();
        }

        // Enqueue the content of the stack at the back of the queue
        while (!stack.isEmpty()){
            queue.add(stack.peek());
            stack.pop();
        }

        // Remove the remaining elements and enqueue them at the end of the queue
        for (int i = 0; i < queue.size() - k; i++) {
            queue.add(queue.peek());
            queue.remove();
        }
    }

    static void print(){
        while (!queue.isEmpty()){
            System.out.print(queue.peek()+" ");
            queue.remove();
        }
    }
    public static void main(String[] args) {
        queue = new LinkedList<Integer>();


        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);
        queue.add(80);
        queue.add(90);
        queue.add(100);

        System.out.println("Before Reversing First K elements \n"+queue);

        int k = 5;
        System.out.println("After Reversing First K elements ");
        reverseQueueFirstKElements(k);
        print();


    }
}
