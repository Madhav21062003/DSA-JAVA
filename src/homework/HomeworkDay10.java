package homework;

public class HomeworkDay10 {
    public static void main(String[] args) {

fff
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
        for (int i = 0; i < n; i++) {
            // Print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Print decreasing numbers
            for (int k = 5; k > n - i - 1; k--) {
                System.out.print(k);
            }

            // Move to the next line after each row
            System.out.println();
        }

        // Q-4
        for (int i = 0; i < n; i++) {
            // Print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Print characters in decreasing order
            for (int k = n; k > n - i - 1; k--) {
                char ch = (char) ('A' + k - 1);
                System.out.print(ch);
            }

            // Move to the next line after each row
            System.out.println();
        }



    }
}
