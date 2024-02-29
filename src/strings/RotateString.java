package strings;

public class RotateString {
    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = "ohell";

        System.out.println(isRotated(str1, str2));

    }

    public static void rotateClockwise(StringBuilder s) {
        char c = s.charAt(s.length() - 1);
        int index = s.length() - 2;

        while (index >= 0) {
            s.setCharAt(index + 1, s.charAt(index));
            index--;
        }
        s.setCharAt(0, c);
    }

    public static void rotateAnticlockwise(StringBuilder s) {
        char c = s.charAt(0);
        int index = 1;

        while (index < s.length()) {
            s.setCharAt(index - 1, s.charAt(index));
            index++;
        }
        s.setCharAt(s.length() - 1, c);
    }

    public static boolean isRotated(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        StringBuilder clockwise = new StringBuilder(str1);
        rotateClockwise(clockwise);
        rotateClockwise(clockwise);

        if (clockwise.toString().equals(str2))
            return true;

        StringBuilder anticlockwise = new StringBuilder(str1);
        rotateAnticlockwise(anticlockwise);
        rotateAnticlockwise(anticlockwise);

        return anticlockwise.toString().equals(str2);
    }

}
