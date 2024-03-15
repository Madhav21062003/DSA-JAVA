package recursion.day_8;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public static void main(String[] args) {

        int n = 3; // Change this value for different n
        List<String> result = generateParenthesis(n);
        for (String s : result) {
            System.out.println(s);
        }
    }
    private static void parenthesis(int n, int left, int right, List<String> ans, StringBuilder temp) {
        if (left + right == 2 * n) {
            ans.add(temp.toString());
            return;
        }

        if (left < n) {
            temp.append('(');
            parenthesis(n, left + 1, right, ans, temp);
            temp.deleteCharAt(temp.length() - 1);
        }

        if (right < left) {
            temp.append(')');
            parenthesis(n, left, right + 1, ans, temp);
            temp.deleteCharAt(temp.length() - 1);
        }
    }

    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        parenthesis(n, 0, 0, ans, new StringBuilder());
        return ans;
    }
}
