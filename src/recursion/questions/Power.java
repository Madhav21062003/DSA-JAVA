package recursion.questions;

public class Power {
    public static void main(String[] args) {

        System.out.println(power(1,4));
    }

    static int power(int a, int b){
        if (b==0)
            return 1;

        return power(a, b-1) * a;


    }
}
