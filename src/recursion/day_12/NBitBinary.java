package recursion.day_12;

import java.util.ArrayList;

public class NBitBinary {
    public static void find(int N, ArrayList<String> ans, StringBuilder temp, int zero, int one) {
        if (temp.length() == N) {
            ans.add(temp.toString());
            return;
        }

        temp.append('1');
        find(N, ans, temp, zero, one + 1);
        temp.deleteCharAt(temp.length() - 1);

        if (zero < one) {
            temp.append('0');
            find(N, ans, temp, zero + 1, one);
            temp.deleteCharAt(temp.length() - 1);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> ans = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        int N = 3; // Change N to desired length
        find(N, ans, temp, 0, 0);
        System.out.println(ans);
    }
}
