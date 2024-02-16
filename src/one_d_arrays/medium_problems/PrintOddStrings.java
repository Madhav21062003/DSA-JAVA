package one_d_arrays.medium_problems;

import java.util.Arrays;

public class PrintOddStrings {
    public static void main(String[] args) {

        String[] list = {"ab", "bc", "cd", "de", "ef", "fg", "gh"} ;

//        System.out.println(list.length);
        for (int i = 0; i < list.length ; i++) {
            if (i % 2 != 0)
                // converted the list of string into array and print it
                System.out.print(Arrays.toString(list[i].toCharArray()));
        }
    }
}
