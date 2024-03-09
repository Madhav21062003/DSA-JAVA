package recursion.day_6;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "naman";
        System.out.println(checkPalindrome(str,0,str.length()-1));
    }

    static boolean checkPalindrome(String str, int start, int end){

        // Base Case
        if (start >= end)
            return true;

        // String Not matched
        if (str.charAt(start) != str.charAt(end))
            return false;

        // String Matched
        return checkPalindrome(str, start+1,end-1);
    }
}
