package one_d_arrays.medium_problems.problemspart2;

public class SwapIntegers {
    public static void main(String[] args) {

       int a = 3;
        int b = 9 ;

        swapUsingSumAndDifference(a,b);
    }

    // Simple swapping
    static void swap(int a, int b){
        System.out.println("Values Before Swapping");
        System.out.println("a = "+a+" b = "+b);

        int temp = a ;
        a = b ;
        b = temp ;
        System.out.println("Values after Swapping");
        System.out.println("a = "+a+" b = "+b);
    }

    // Swapping the 2 given values using sum and difference

    static void swapUsingSumAndDifference(int a, int b){
        System.out.println("Values Before Swapping");
        System.out.println("a = "+a+" b = "+b);


        a = a + b ;  // a = 12
        b = a - b ;  // b = 9
        a = a - b ;  // c = 3
        System.out.println("Values after Swapping");
        System.out.println("a = "+a+" b = "+b);
    }
}
