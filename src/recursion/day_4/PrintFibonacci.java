package recursion.day_4;

public class PrintFibonacci {
    public static void main(String[] args) {

        System.out.println(printFibonacci(5));
    }

    static long printFibonacci(long n){
        if (n <= 1)
            return n;

        return printFibonacci(n-1) + printFibonacci(n-2);
    }
}
