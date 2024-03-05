package recursion.day_2;

public class Print10ToN {
    public static void main(String[] args) {

        print(20);
    }

    static void print(int n){
        if (n == 10)
            System.out.print(n+" ");

        else {
            print(n-1);
            System.out.print(n+" ");
        }
    }
}
