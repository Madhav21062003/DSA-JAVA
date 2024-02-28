package strings;

import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // initialization and Declaration
        String str = "Madhav Solanki";

        // Taking Input in String

        // In sc.next  it only recognize the all characters before space
//        String s = sc.next();
//        System.out.println(s);

        // In sc.nextLine it recognize all the characters of the strings no matter how much there are spaces between them are present
//        String s1 = sc.nextLine();
//        String s2 = sc.nextLine();
//        String s = s1 + s2;
//        System.out.println(s1.concat(" "+s2));
//        System.out.println(s1.length());

        // using Escape character

        String s3 = "Madhav is a \"good\" boy";
        System.out.println(s3);
        // To find the index of a particular character in the string
//        System.out.println(str.indexOf('a'));

        // To compare the strings we use compareTo(), this Method compare the Strings in Lexicographically manner
//        String st1 = "Hello";
//        String st2 = "abcd";
//        System.out.println(st1.compareTo(st2));
//
//        String st3 = "abe";
//        String st4 = "cde" ;
//        System.out.println(st3.compareTo(st4));

        // Check Strings contains the particular character string or Not
//        String st5 = "Madhav";
//        System.out.println(st5.contains("M"));
//
//        // check string ends with which
//        System.out.println(st5.endsWith("11"));
    }
}
