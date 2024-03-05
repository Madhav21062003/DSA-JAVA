package recursion.day_2;

public class PrintTable {
    public static void main(String[] args) {
        printTable(2,10);
    }

    static void printTable(int n, int range){
        if (range == 0)
            return;



        printTable(n,range-1);
        System.out.println(n +" X "+ range+" = "+ n * range);
    }
}
