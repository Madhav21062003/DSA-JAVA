package recursion.day_6;

public class ReverseString {
    public static void main(String[] args) {

        char[] ch = "Madhav".toCharArray();
        int n = ch.length;
        revString(ch,0,n);

    }

    static void revString(char[] ch, int idx, int n){
        if (idx == n)
            return;

        char c = ch[idx];
        revString(ch,idx+1,n);
        System.out.print(c);
    }
}
