package one_d_arrays.hard_problems;

import java.util.Arrays;

public class FourSum {
    public static void main(String[] args) {

    }


    boolean find4Numbers(int A[], int n, int X) {
        Arrays.sort(A);
        //int j=n-1;
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                int k = i + 1;
                int l = j - 1;

                while (k < l) {
                    if (A[i] + A[j] + A[k] + A[l] == X) {
                        return true;
                    } else if (A[i] + A[j] + A[k] + A[l] >= X) {
                        l--;
                    } else {
                        k++;
                    }
                }
            }
        }
        return false;
    }

}
