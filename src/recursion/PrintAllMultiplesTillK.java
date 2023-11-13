package recursion;

public class PrintAllMultiplesTillK {
    public static void main(String[] args) {


        printMultiplesTillK(12,5);
        System.out.println();
        printMultiplesTillKRecursive(12,5);
    }

    // Iterative Approach
    static void printMultiplesTillK(int num, int k){

        int times = 1 ;
        while (times <= k){
            System.out.print(num * times+" ");
            times++ ;
        }
    }

    // Recursive Approach

    static void printMultiplesTillKRecursive(int num, int k){

        // base case
        if (k == 0) {
            return;
        }

        // recurrence Relation
        printMultiplesTillKRecursive(num, k-1);

        // self work
        System.out.print(num * k+" ");


    }
}
