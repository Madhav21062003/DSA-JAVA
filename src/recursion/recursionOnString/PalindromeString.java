package recursion.recursionOnString;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = reverse(s,0);

        if (rev.equals(s))
            System.out.println(s+ " is Palindrome");
        else
            System.out.println(s+" is Not Palindrome");

        System.out.println(isPalindrome(s,0,s.length()-1));
    }

    static String reverse(String s, int idx){
        if (idx == s.length())
            return "";

        String smallAns = reverse(s, idx+1);
        return smallAns + s.charAt(idx);
    }

    static boolean isPalindrome(String s, int l, int r){
        if (l >= r)
            return true;

        return (s.charAt(l) == s.charAt(r) && isPalindrome(s, l+1, r-1));
    }
}
