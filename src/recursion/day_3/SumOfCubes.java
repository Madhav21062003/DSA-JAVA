package recursion.day_3;

public class SumOfCubes {
    public static void main(String[] args) {
        System.out.println(sumOfCubes(3));
    }
    static int sumOfCubes(int n){
        if (n == 0)
            return 0;

        return  (n*n*n) + sumOfCubes(n-1);
    }
}
