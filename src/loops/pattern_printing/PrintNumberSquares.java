package loops.pattern_printing;

public class PrintNumberSquares {
    public static void main(String[] args) {

        int res = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                res = j * j ;
                System.out.print(res+" ");
            }
            System.out.println();
        }
    }
}
