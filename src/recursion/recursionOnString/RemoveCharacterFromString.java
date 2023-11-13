package recursion.recursionOnString;

public class RemoveCharacterFromString {
    public static void main(String[] args) {

        String s = "Madhav Solanki";

        System.out.print(removeAllOccurencesOfCharacter(s+" "));
        System.out.println();
        char k = 'M';
        removeElementFromString(s,0,k);
    }

    // iterative approach
    static String removeAllOccurencesOfCharacter(String s){
        String ans = " ";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'a')
                ans += s.charAt(i);
        }

        return ans;
    }

    // recursive approach
    static void removeElementFromString(String s,int index, char key){

        if (index == s.length())
            return;

        if (s.charAt(index) != key)
            System.out.print(s.charAt(index));

        removeElementFromString(s, index+1, key);

    }
}
