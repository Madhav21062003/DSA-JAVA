package functions;

public class TrailingZeros {
    public static void main(String[] args) {

        int result = trailingZeros(100);
        System.out.println(result);

    }
    static int trailingZeros(int num){

// No of zeros
        int count = 0;
       while (num >= 5){
           count = count + num / 5;
           num = num / 5;
       }
       return count;
    }
}
