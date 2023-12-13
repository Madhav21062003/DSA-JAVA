package Queuees;

import java.util.Deque;
import java.util.LinkedList;

public class DequeImplementation {
    public static void main(String[] args) {

        Deque<Integer> deque = new LinkedList<>();

        // add, remove , peek/element

        deque.addLast(1);
        deque.addLast(2);
        deque.addLast(3);
        deque.addLast(4);

        System.out.println(deque);
        deque.addFirst(5);
        System.out.println(deque);

        deque.removeLast();
        System.out.println(deque);

        deque.removeFirst();
        System.out.println(deque);

        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());

        deque.add(6);
        System.out.println(deque);

        deque.remove();
        System.out.println(deque);

        deque.removeAll(deque);
        System.out.println(deque);



    }
}
