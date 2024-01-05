package loops.pattern_printing.HardPatterns;

public class Pattern4 {
    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {

            // Space print
            for (int col = 1; col <= (n-row); col++) {
                System.out.print(" ");
            }
            for (char name = 'A'; name <= 'A' + (row-1); name++) {
                System.out.print(name);
            }
            System.out.println();
        }
    }
}
