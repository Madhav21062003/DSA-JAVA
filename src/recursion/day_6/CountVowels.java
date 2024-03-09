package recursion.day_6;

public class CountVowels {
    public static void main(String[] args) {
        String str = "madhavi";
        System.out.println(countVowels(str,str.length()-1));
    }

    static int countVowels(String str, int idx){
        // Base Cse
        if (idx == -1)
            return 0;

        // Vowel Hoga
        if (str.charAt(idx) == 'a' || str.charAt(idx) == 'e' || str.charAt(idx) == 'i' || str.charAt(idx) == 'o' || str.charAt(idx) == 'u')
            return 1 + countVowels(str, idx-1);

        // Vowel Nahin Hoga
        else
            return countVowels(str, idx-1);
    }
}
