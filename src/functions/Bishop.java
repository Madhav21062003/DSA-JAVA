package functions;

public class Bishop {
    public static void main(String[] args) {


    }
// calculating the number of Bishop's moves

    static int minBishopMoves(int A, int B){
        int count = 0;
       count = count + Math.min(8-A, 8-B);
       count = count + Math.min(8-A, B-1);
       count = count + Math.min(A-1, B-1);
       count = count + Math.min(A-1, 8-B);

       return count;
    }
}
