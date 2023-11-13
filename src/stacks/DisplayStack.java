package stacks;

import java.util.Stack;

public class DisplayStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
//        System.out.println(st);
        System.out.println("Displaying using Stack");
        displayStack(st);

        System.out.println("Displaying using Array");
        displayStackUsingArray(st);

        System.out.println("Displaying Stack Recursively");
        displaySTackRecursively(st);

    }


    // Printing stack
    public static void displayStack(Stack<Integer> temp){

        Stack<Integer> newSt = new Stack();
        while (temp.size() > 0){
            newSt.push(temp.pop());
        }

        while (newSt.size() > 0){
            int x = newSt.pop();
            System.out.print(x+" ");
            temp.push(x);
        }
        System.out.println();
    }


    // Displaying Stack using array
    public static void displayStackUsingArray(Stack<Integer> temp){

            int n = temp.size();
            int[] arr = new int[n];
        for (int i = n-1; i >= 0; i--) {
            arr[i] = temp.pop();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
            temp.push(arr[i]);
        }
        System.out.println();
    }

    public static void displaySTackRecursively(Stack<Integer> st){
        if (st.size() == 0)
            return;

        int top = st.pop();
        displaySTackRecursively(st);
        System.out.print(top+" ");
        st.push(top);
    }
}
