package strings;

import java.util.Scanner;

public class Toggle {
    public static void main(String[] args) {
        // Taking input in string builder
        Scanner sc = new Scanner(System.in);

        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);

        // toggle
        // PHysiCS - > phYSIcs
        for (int i = 0; i < str.length(); i++) {
            boolean flag  = true ;
            char ch = str.charAt(i);   // A
            if (ch == ' ')
                continue;
            int asci = (int) ch ;  // 65
            if (asci >= 97)
                flag = false ;  // small

            if (flag == true){
                asci += 32 ;
                char dh = (char) asci ;  // a
                str.setCharAt(i, dh);
            }
            else {  // small
                asci -= 32 ;
                char dh = (char) asci ;
                str.setCharAt(i, dh);
            }
        }
        System.out.println(str);
    }

}
