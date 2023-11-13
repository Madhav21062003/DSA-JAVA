package stacks;

import java.util.ArrayList;
import java.util.*;

public class ImplementUsingArrayList {
    static class StackDs {
        static ArrayList<Integer> list = new ArrayList<>();



        public static boolean isEmpty() {
            return list.size() == 0;
        }

        public static void push(int data) {
            list.add(data);
        }

        //pop
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        //peek
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        StackDs stackDs = new StackDs();
        StackDs.push(1);
        StackDs.push(2);
        StackDs.push(3);
        StackDs.push(4);

        while (!stackDs.isEmpty()) {
            System.out.println(stackDs.peek());
            stackDs.pop();
        }
    }
}
