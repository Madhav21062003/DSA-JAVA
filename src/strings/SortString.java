package strings;

public class SortString {
    public static void main(String[] args) {

    }

    static String sort(String s)
    {
        // code here
        int[] alpha = new int[26];

        for (int i = 0; i < s.length(); i++) {
            alpha[s.charAt(i) - 'a']++;
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char c = (char) ('a' + i);

            while (alpha[i] > 0) {
                ans.append(c);
                alpha[i]--;
            }
        }

        return ans.toString();
    }
}
