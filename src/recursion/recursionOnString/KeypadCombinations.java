package recursion.recursionOnString;

public class KeypadCombinations {
    public static void main(String[] args) {

        String combination = "253";
        // Storing the data of Keypad in an Array
        //               1   2    3      4      5      6      7      8      9       10
        String[] keys= {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        System.out.println("The Possible Combinations are as Follows: ");
        keypadCombination(combination,keys,"");
    }

    static void keypadCombination(String dig, String[] kp,  String res){

        // base case
        if (dig.isEmpty()){
            System.out.print(res+" ");
            return;
        }

        int currNum = dig.charAt(0) - '0' ; //2
        String currChoices = kp[currNum];

        for (int i = 0; i < currChoices.length(); i++) {
            keypadCombination(dig.substring(1), kp, res + currChoices.charAt(i));
        }


    }
}
