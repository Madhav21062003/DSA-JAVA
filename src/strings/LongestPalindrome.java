package strings;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "aabbccd";

        int[] lower = new int[26];
        int[] upper = new int[26];

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a'){
                lower[s.charAt(i) - 'a']++;
            }
            else {
                upper[s.charAt(i) - 'A']++;
            }
        }

        int count = 0;
        boolean  odd = false;
        for (int i = 0; i < 26; i++) {
            if (lower[i] % 2 == 0){
                count = count + lower[i];
            }
            else {
                count = count + lower[i] - 1 ;
                odd = true ;
            }

            if (upper[i] % 2 == 0){
                count = count + upper[i] ;
            }
            else {
                count = count + upper[i] - 1;
                odd = true;
            }
        }

        int ans = count + (odd? 1:0);
        System.out.println(ans);
    }
}
