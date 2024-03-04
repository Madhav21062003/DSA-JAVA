package recursion.questions;

public class SeriesSum {
    public static void main(String[] args) {

        System.out.println(seriesSum(5));
    }

    static int seriesSum(int n){
        if (n==0)
            return 0;

        return seriesSum(n-1) + n ;
    }
}
