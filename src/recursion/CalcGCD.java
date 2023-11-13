package recursion;

public class CalcGCD {
    public static void main(String[] args) {
        int ans = calcGcd(4,9);
        System.out.println("The Greatest common Divisor = "+ans);

        int result = calcGcdMethod2(24,15);
        System.out.println("The GCD of the Given Number is = "+result);

        int result_2 = gcdUsingEuclidAlgo(24,15);
        System.out.println("The GCD of the Given Number Using Euclid algorithm  is = "+result_2);

        System.out.println("LCM of the Given Number is= "+lcm(2,3));
    }

    static int calcGcd(int x, int y){
        int min = Math.min(x, y);
        int ans = 0;

        for (int i = min; i > 0; i--) {
            if (x % i == 0 && y % i == 0) {
                ans = i ;
                break;

            }
        }
       return ans ;
    }

    // iterative Approach - 2
    static int calcGcdMethod2(int x, int y){
        while (x % y !=0){
            int remainder = x % y;
            x = y ;
            y = remainder ;
        }

        return y;
    }

    // GCD using Euclid Algorithm
    static int gcdUsingEuclidAlgo(int x, int y){
        if (y == 0)
            return x;

        return gcdUsingEuclidAlgo(y, x % y);
    }

    static int lcm(int x, int y ){
        int prduct = x * y ;

        int ans = prduct / gcdUsingEuclidAlgo(x, y);

        return ans ;
    }
}
