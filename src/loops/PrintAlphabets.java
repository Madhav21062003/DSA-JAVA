package loops;

public class PrintAlphabets {
    public static void main(String[] args) {

        char name;
        for (name = 'a'; name <= 'z'; name++) {
            System.out.print(name+" ");
        }
        System.out.println();
        for (name = 'A'; name <= 'Z'; name++) {
            System.out.print(name+" ");
        }
    }
}
