package recursion.day_3;

public class SumOfNNumber {
    public static void main(String[] args) {
        System.out.println(sumOfNNumber(5));
    }

    static int sumOfNNumber(int n){
        
        if (n == 0)
            return 0;

        else {
            return n + sumOfNNumber(n-1) ;
        }
    }
}
