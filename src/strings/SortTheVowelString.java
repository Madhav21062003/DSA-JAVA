package strings;

public class SortTheVowelString {
    public static void main(String[] args) {

       String sb= "leetcode";
        int[] lower = new int[26];
        int[] upper = new int[26];
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i' || sb.charAt(i) == 'o'|| sb.charAt(i) == 'u')
            {
                lower[sb.charAt(i) - 'a']++;
                sb.replace((char) i,'#');
            } else if (sb.charAt(i) == 'A' || sb.charAt(i) == 'E' || sb.charAt(i) == 'I' || sb.charAt(i) == 'O'|| sb.charAt(i) == 'U')
            {
                upper[sb.charAt(i) - 'A']++;
                sb.replace((char) i,'#');
            }
        }

        String ans = "";
        for (int i = 0; i < 26; i++) {  // upper case
            char c = (char) ('A' + i);
            while (upper[i] != 0){
                ans += c;
                upper[i]--;
            }
        }

        for (int i = 0; i < 26; i++) {
            char c = (char) ( 'a' + i);
            while (lower[i] != 0){
                ans += c;
                lower[i]--;
            }
        }

        int first = 0, second = 0, k = 0;
        while (second < ans.length()){
            if (sb.charAt(first) == '#'){
                sb.replace((char) first, (char) second);
                second++;
            }
            first++;
        }

        System.out.println(sb);
    }
}
