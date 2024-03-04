package recursion.day_1;

public class PrintStatement {
    public static void main(String[] args) {
        print(10);
    }

    static void print(int n){
        if (n == 0)
            return;

        else {
            print(n-1);
            System.out.println(n+ "Coder Army");
        }
    }
}
