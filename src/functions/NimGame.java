package functions;

public class NimGame {
    public static void main(String[] args) {

        // Problem link - https://leetcode.com/problems/nim-game/description/
        // Leetcode - 292
    }

    static boolean canWinNim(int n){
       // Check the remainder
        if(n % 4 == 0){
            return false;
        }

        return true;
    }
}
