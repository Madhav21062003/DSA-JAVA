package loops.whileloops;

public class PrintFactors {
    public static void main(String[] args) {

        int n = 10;
        int i = 1;

        while (i <= n){
            if (n % i == 0){
                System.out.print(i+" ");
            }
            i++;
        }
    }
}
