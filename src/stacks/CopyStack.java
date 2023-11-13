package stacks;

import java.util.Scanner;
import java.util.Stack;

public class CopyStack {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> st1 = new Stack<>();

        int n ;
        System.out.println("Enter the Number of Elements you want to insert into Stack");
        n = sc.nextInt();

        System.out.println("Enter Elements: ");
        for (int i = 1; i <= n; i++) {
                int x = sc.nextInt();
                st1.push(x);
        }
//        System.out.println("The Element in the Stack are as follows => "+st1);
        System.out.println("Orginal Given Stack = > "+st1);
        // Moving the elements from one stack to another
        Stack<Integer> st2 = new Stack<>();
        while (st1.size() > 0){

            // accessing the top most element of first stack
            int x = st1.peek();

            // push  the peek elements to new stack
            st2.push(x);

            // after pushing the element remove the elemets from the previous stack
            st1.pop();
        }

        // now we made a new stack i st2 stack the elements are saved in reverse order now again we reverse the order
        // then finally we get our orginal given form stack

        Stack<Integer> st3 = new Stack();

        while (st2.size() > 0 ){
            // accessing the top most element of first stack
            int x = st2.peek();

            // push  the peek elements to new stack
            st3.push(x);

            // after pushing the element remove the elemets from the previous stack
            st2.pop();
        }
        System.out.println("Copied Stack = > "+st3);
    }
}
