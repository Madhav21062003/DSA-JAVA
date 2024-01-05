package loops.pattern_printing.HardPatterns;

public class Pattern6 {
    public static void main(String[] args) {



        int row ,  col, n = 5;
        for (row = 1; row <= n; row++){
            for ( col = 1; col <= (n-row) ; col++) {
                System.out.print(" ");
            }
            for (col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
