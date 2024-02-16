package one_d_arrays.medium_problems;

public class CheckEquality {
    public static void main(String[] args) {

        int[] a = {2,5,7,9,11};
        int[] b = {2,5,7,9,11};

        System.out.println(checkEquality(a,b));

        int[] c = {2,5,7,9,11};
        int[] d = {2,5,7,19,11};
        System.out.println(checkEquality(c,d));

    }

    static boolean checkEquality(int[]a, int[]b){

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true ;
    }
}
