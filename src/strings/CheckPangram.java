package strings;

public class CheckPangram {
    public static void main(String[] args) {

            String s = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(s));
    }

    public static boolean checkIfPangram(String sentence) {
        boolean[] alpha = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            alpha[sentence.charAt(i) - 'a'] = true;
        }

        for (boolean letter : alpha) {
            if (!letter)
                return false;
        }
        return true;
    }
}
