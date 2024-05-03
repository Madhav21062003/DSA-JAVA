package stacks.day_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class MakeArrayBeautiful {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> makeBeautiful(int[] arr) {
        // code here

        Stack<Integer> st = new Stack<>();

        for(int i=0; i<arr.length; i++){
            if(st.empty()){
                st.push(arr[i]);
            }

            else if(arr[i] >= 0) {

                if(st.peek() >= 0){
                    st.push(arr[i]);
                }
                else {
                    st.pop();
                }
            }

            else {
                if(st.peek() < 0){
                    st.push(arr[i]);
                }
                else {
                    st.pop();
                }

            }
        }

        // Create a new ArrayList to store the result
        ArrayList<Integer> result = new ArrayList<>();

        // Pop the elements from the stack and add them to the result ArrayList
        while(!st.empty()) {
            result.add(st.peek());
            st.pop();
        }

        // Reverse the order of the elements in the result ArrayList
        Collections.reverse(result);

        // Return the result ArrayList
        return result;
    }

}
