package strings;

public class PrintAllSubstrings {
    public static void main(String[] args) {

        String str = "abcd" ;

        for (int i = 0; i <= str.length()-1; i++) {
            for (int j = i+1; j <= str.length(); j++) {
                System.out.print(str.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
