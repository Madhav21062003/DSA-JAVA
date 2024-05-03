package stacks.day_1;

import java.util.Stack;
import java.util.Vector;

public class StringManipulation {
    public static void main(String[] args) {

        String[] str = {"ab","ac","da","da", "ac", "db", "ea"};

        Stack<String> s = new Stack<>();

        for (int i = 0; i < str.length; i++) {
            if (s.empty()){
                s.push(str[i]);
            } else if (s.peek().equals(str[i])) {
                s.pop();
            }
            else {
                s.push(str[i]);
            }
        }
        System.out.println(s.size());

    }

    static int removeConsecutiveSame(Vector<String > v)
    {
        // Your code goes here
        Stack<String> s = new Stack<>();

        for(int i=0; i<v.size(); i++){

            // If Stack is empty
            if(s.empty()){
                s.push(v.get(i));
            }

            else if(s.peek().equals(v.get(i))){
                s.pop();
            }

            else {
                s.push(v.get(i));
            }
        }

        return s.size();
    }

}
