package recursion;

public class PrintNumberTillN {
    public static void main(String[] args) {

        System.out.println("The Number till N:");
        printNumberTillN(10);
    }

    static void printNumberTillN(int n){

        if (n==0)
            return ;

       printNumberTillN(n-1);
        System.out.print(n+" ");

    }
}
