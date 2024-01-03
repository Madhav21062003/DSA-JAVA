package loops.pattern_printing;

public class SquarePattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++){
                System.out.print(10+" ");
            }
            System.out.println();
        }
        System.out.println();


        for (int row = 1; row <= 5; row++){
            for (int col = 1; col <= 5; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
        System.out.println();

        for (int row = 1; row <= 5; row++){
            for (int col = 5; col > 0; col--) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
        System.out.println();


        int count = 1;
        for (int row = 1; row<= 5; row++){
            for (int col = 1; col <= 5; col++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
        System.out.println();

        // without using count variable

        for (int row = 1; row<= 5; row++){
            for (int col = 1; col <= 5; col++){
                System.out.print((row-1) * 5+ col+" ");
            }
            System.out.println();
        }
    }
}
