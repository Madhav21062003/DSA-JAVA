package stacks.day_1;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {


        String str = "(()){}[()][";
        System.out.println(validParentheses(str));


    }

    static  boolean validParentheses(String str){

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '['){
                st.push(str.charAt(i));
            }

            else {
                if (st.empty())
                    return false;

                else if (str.charAt(i) == ')') {
                    if (st.peek() != '(')
                        return false;

                    else
                        st.pop();
                }

                else if (str.charAt(i) == '}') {
                    if (st.peek() != '{')
                        return false;

                    else
                        st.pop();
                }

                else {
                    if (st.peek() != '[')
                        return false;

                    else
                        st.pop();
                }
            }
        }
        return st.empty();
    }
}
