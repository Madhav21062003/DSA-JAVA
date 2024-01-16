package online_platform_problems;

public class PowerOfTWO {
    public static void main(String[] args) {

        // Leetcode 231
        int res = 64;
        System.out.println(powerOfTwo(res));
    }
    static boolean powerOfTwo(int x){

        if (x < 1)
            return false;

        while (x != 1){
            if (x % 2== 1)
                return false;

            x = x / 2;
        }
        return true;
    }
}
