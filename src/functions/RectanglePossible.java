package functions;

public class RectanglePossible {
    public static void main(String[] args) {

        boolean ans = rectanglePossible(1,2,1,2);
        System.out.println(ans);
    }
   //Function to check the reactangle is possible or not
    static boolean rectanglePossible(int a, int b, int c, int d){
        if (a == b && a==c && a == d){
            return false;
        }
        else if ((a == b && c == d) || (a == c && b == d) || (a == d && b == c))
            return true;
        else
            return false;
    }
}
