package Queuees;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        // Adding Elements in  the queue
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        queue.add(10);

        // Display All elements of the queue
        System.out.println(queue);

        // Remove the element of the Queue
        queue.remove(10);
        System.out.println(queue);

        // Peek element of the queue
        System.out.println(queue.peek());

        // Size of the queue
        System.out.println(queue.size());

        System.out.println(queue.remove());


    }
}
