package functions;

public class ConvertCharacter {
    public static void main(String[] args) {

        // I/O - 'a'  O/P -> 'A'
        System.out.println(covertCharacter('h'));

    }

    static char covertCharacter(char ch){
        char ans = (char) (ch - 'a' + 'A');
        return ans;
    }
}
