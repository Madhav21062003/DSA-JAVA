package operators;

public class Logical {
    public static void main(String[] args) {


        // Logical Operators are: &&(AND), ||(OR), !(NOT)

        int a = 10;
        int b = 12;
        int c = 8;
        int d = 5;

        // Use of && operator
        if (a > b &&  c > d){
            System.out.println("Yes");
        }
        else {
            System.out.println("NO");
        }

        // Use of || operator
        if (a > b ||  c > d){
            System.out.println("Yes");
        }
        else {
            System.out.println("NO");
        }

        // Use of ! operator
        System.out.println(!(a>b));


    }
}
