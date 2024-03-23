package recursion.day_11;

public class TowerOfHanoi {

    long count = 0;


    public long toh(int N, int from, int to, int aux) {
        // Your code here

        if(N == 0)
            return 0;
        toh(N-1, from, aux, to);
        System.out.println("move disk " + N + " from rod " + from + " to rod " + to);
        count++;
        toh(N-1, aux, to, from);
        return count;
    }
    public static void main(String[] args) {

    }
}
