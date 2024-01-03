package loops.pattern_printing;

public class PrintNumbersCubePattern {
    public static void main(String[] args) {

        int cube = 1 ;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                cube = j * j * j ;
                System.out.print(cube+" ");
            }
            System.out.println();
        }
    }
}
