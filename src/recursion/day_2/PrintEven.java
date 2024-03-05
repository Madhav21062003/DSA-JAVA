package recursion.day_2;

public class PrintEven {
    public static void main(String[] args) {
        int n = 11 ;
            if (n % 2 ==1){
                n--;
                printEven(n);
            }
            else
                printEven(n);


    }

    static void printEven(int n){


        if (n == 1)
            return;

        System.out.println(n);
        printEven(n-2);
    }
}
