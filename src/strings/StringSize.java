package strings;

public class StringSize {
    public static void main(String[] args) {
        int size = 0;

        String str = "Madhav";
        while (str.charAt(size) != 0){
            size++;
        }
        System.out.println(size);
    }
}
