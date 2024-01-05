package loops.pattern_printing.HardPatterns;

public class Pattern1 {
    public static void main(String[] args) {


        /*
        *           *
        *         * *
        *       * * *
        * */

        int row ,  col, n = 10;
        for (row = 1; row <= n; row++){
            for ( col = 1; col <= (n-row) ; col++) {
                System.out.print(" ");
            }
            for (col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
