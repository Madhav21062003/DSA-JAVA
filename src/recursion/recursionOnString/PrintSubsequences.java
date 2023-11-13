package recursion.recursionOnString;

import java.util.ArrayList;

public class PrintSubsequences {
    public static void main(String[] args) {

        ArrayList<String> ans =  printSubsequences("abc");

        System.out.println("The Subsequences of the strings are: ");
        for (String ss : ans) {
            System.out.print(ss+" ");
        }
        System.out.println( );
        System.out.println("The Sub sequences of the string are: ");
        getSubsequences("abc", "");
    }

    static ArrayList<String> printSubsequences(String s){

        ArrayList<String> ans = new ArrayList<>();

        // base case
        if (s.isEmpty()){
            ans.add("");
            return ans;
        }
        char curr = s.charAt(0);   // a
        ArrayList<String> smallAns = printSubsequences(s.substring(1));   // ["bc", "b", "c", ""]

        // ans = ["bc", "b", "c", "", "abc", "ab", "ac", "a"]
        // ans = ["bc", "abc", "b", "ab", "c", "ac", "", a]
        for (String ss: smallAns) {
            ans.add(ss); // bc
            ans.add(curr + ss); // abc
        }
            return  ans;
    }

    static void getSubsequences(String s, String currAns){


        // base case
        if (s.isEmpty()) {
            System.out.print(currAns+" ");
            return;
        }
        char curr = s.charAt(0);
        String remString = s.substring(1);

        // Curr char -> Chooses to be a part of current Ans
            getSubsequences(remString, currAns + curr);  // bc, a

        // Curr char -> does not choose to be a part of currAns
            getSubsequences(remString, currAns);
    }
}
