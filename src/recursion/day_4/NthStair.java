package recursion.day_4;

public class NthStair {
    public static void main(String[] args) {

        System.out.println(nthStairStep(6));
    }

    static int nthStairStep(int n){
        if (n <= 1)
            return 1;

        return nthStairStep(n-1) + nthStairStep(n-2);
    }
}
