package recursion.day_3;

public class PrintFactorial {
    public static void main(String[] args) {
        System.out.println(printFactorial(1));
    }

    static int printFactorial(int n){
        if (n < 0)
            return 1;
        if (n == 0 || n == 1)
            return 1;

        else
            return n * printFactorial(n-1);
    }
}
