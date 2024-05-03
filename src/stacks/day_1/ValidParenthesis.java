package stacks.day_1;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {

        String str = "((())())";
        boolean checkParenthesisValidation = check(str);
//        System.out.println(checkParenthesisValidation);

        System.out.println(checkParenthesis(str));
    }

    public static boolean check(String str){
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '('){
                s.push(str.charAt(i));
            }

            else {
                if (s.empty()){
                    return false;
                }
                else
                    s.pop();
            }
        }
        return s.empty();
    }

    // Method 2 without stack
    static boolean checkParenthesis(String str){

        int left = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '('){
                left++;
            }
            else {
                if (left == 0)
                    return false;
                 else
                     left--;
            }

        }

        return left == 0;
    }
}
