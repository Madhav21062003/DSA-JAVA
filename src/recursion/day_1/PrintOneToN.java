package recursion.day_1;

public class PrintOneToN {
    public static void main(String[] args) {
        print1ToN(20);
    }

    private static void print1ToN(int n) {
        if (n == 1)
            System.out.print(n+" ");

        else {
            print1ToN(n-1);
            System.out.print(n+" ");
        }
    }
}
