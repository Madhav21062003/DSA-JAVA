package strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str  = sc.nextLine();

        StringBuilder gtr = new StringBuilder(str);
        gtr.reverse();
        String s = gtr + "" ;

        if (str.equals(s)){
            System.out.println("String is Palindrome");
        }else {
            System.out.println("String is Not Palindrome");
        }


        // Without using String builder
        int i = 0 ;
        int j = str.length()-1;
        boolean flag = true ;
        while (i < j){
            if (str.charAt(i)!= str.charAt(j)) {
                flag = false;
                break;
            }
            i++;
            j--;
        }

        if (!flag)
            System.out.println("Not Palindrome");
        else
            System.out.println("Palindrome");
    }
}
