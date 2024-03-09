package recursion.day_6;

public class LowercaseToUppercase {
    public static void main(String[] args) {

        char[] ch = "madhav".toCharArray();
        int n = ch.length-1;
        lowerToUpper(ch,n);
        System.out.println(ch);
    }

    static void lowerToUpper(char[] ch, int idx){
        if (idx == -1)
            return;

        ch[idx] = (char) ('A' + ch[idx] - 'a');
        lowerToUpper(ch, idx-1);


    }
}
