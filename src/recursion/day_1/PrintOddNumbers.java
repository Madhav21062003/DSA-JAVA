package recursion.day_1;

public class PrintOddNumbers {
    public static void main(String[] args) {
        
        printOdd(20);
    }

    private static void printOdd(int n) {

        if (n == 1)
            System.out.println(n);
        else  {
            printOdd(n-1);
            if(n % 2 == 1)
            System.out.println((n ));
        }
    }


}
