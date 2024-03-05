package recursion.day_2;

public class PrintEven {
    public static void main(String[] args) {
        int n = 11 ;


        printEven(n);


    }

    static void printEven(int n){


        if (n == 1)
            return;

        printEven(n-1);
        if (n % 2 == 0)
            System.out.print(n+" ");
    }
}
