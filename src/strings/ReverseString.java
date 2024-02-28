package strings;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Madhav";
       int start =0, end = s.length()-1;

        for (int i = end; i >=0 ; i--) {
            System.out.print(s.charAt(i)+" ");
        }
    }
}
