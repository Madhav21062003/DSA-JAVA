package loops.pattern_printing.HardPatterns;

public class Pattern8 {
    public static void main(String[] args) {

        int n = 5 ;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            for (int col = row-1; col >= 1; col--) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
