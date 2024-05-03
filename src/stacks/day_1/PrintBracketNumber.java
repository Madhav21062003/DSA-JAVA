package stacks.day_1;

import java.util.ArrayList;
import java.util.Stack;

public class PrintBracketNumber {
    public static void main(String[] args) {

        System.out.println(bracketNumbers("(aa(bdc))p(dee)"));

    }

    static ArrayList<Integer> bracketNumbers(String s) {
        // code here

        int count = 0;
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i< s.length(); i++)
        {
            // Opening Bracket
            if(s.charAt(i) == '('){
                count++;
                st.push(count);
                ans.add(count);
            }
            // Closing bracket
            else if(s.charAt(i) == ')'){
                ans.add(st.peek());
                st.pop();
            }
        }

        return ans;
    }
}
