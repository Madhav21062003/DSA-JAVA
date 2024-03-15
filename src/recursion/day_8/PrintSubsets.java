package recursion.day_8;

import java.util.ArrayList;


public class PrintSubsets {
    public static void main(String[] args) {

       String s = "abc";
       ArrayList<String> ans = new ArrayList<>();   // final ans
       ArrayList<String> temp = new ArrayList<>();
       subset(s,0,s.length(),ans,temp);
        System.out.println(ans);
    }

    private static void subset(String s, int idx, int n, ArrayList<String> ans, ArrayList<String> temp) {

        if (idx == n){
            ans.add(String.valueOf(temp));
            return;
        }

        // not included
        subset(s, idx+1,n,ans,temp);

        // included
        temp.add(String.valueOf(s.charAt(idx)));
        subset(s, idx+1,n,ans,temp);
        temp.remove(temp.size()-1);
    }
}
