package homework;

public class HomeworkDay10 {
    public static void main(String[] args) {


        // Q-1
        int n = 5 ;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row; col++) {
                System.out.print(" ");
            }
                for (int col = row; col >= 1; col--) {
                    System.out.print(col);
                }
            System.out.println();
        }


        // Q-2
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print characters
            for (int k = 1; k <= i; k++) {
                System.out.print((char) (64 + i) );
            }

            // Move to the next line after each row
            System.out.println();
        }

        // Q-3

        // Q-4
    }
}
