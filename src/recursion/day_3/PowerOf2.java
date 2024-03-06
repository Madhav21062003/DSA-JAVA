package recursion.day_3;

public class PowerOf2 {
    public static void main(String[] args) {
        System.out.println(powerOfTwo(5));
    }

    static int powerOfTwo(int n){
        if (n == 0)
            return 1;

        else
            return  2 * powerOfTwo(n-1);
    }
}
