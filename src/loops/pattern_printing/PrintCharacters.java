package loops.pattern_printing;

public class PrintCharacters {
    public static void main(String[] args) {

        int n = 5 ;
        for (int row = 1; row <= n; row++) {
            char ch = (char) ('a' + (row -1));
            for (int col = 1; col <= n; col++) {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (char j = 'a'; j <= 'e'; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
