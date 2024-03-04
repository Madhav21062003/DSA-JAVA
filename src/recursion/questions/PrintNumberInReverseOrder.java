package recursion.questions;

public class PrintNumberInReverseOrder {
    public static void main(String[] args) {

        System.out.println("The Number till N in Reverse order:");
        printNumberInReverseOrder(5);
    }

    static void printNumberInReverseOrder(int n){
        if (n==0)
            return;

        System.out.print(n+" ");
        printNumberInReverseOrder(n-1);
    }
}
