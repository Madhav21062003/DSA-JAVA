package recursion.recursionOnString;


public class ReverseString {
    public static void main(String[] args) {

        String s = "Madhav";
        System.out.print(reverse(s,0)+" ");
    }

    static String reverse(String s, int index){
        if (index == s.length())
            return " ";

        String smallAns = reverse(s, index+1);
        return smallAns + s.charAt(index);
    }
}
