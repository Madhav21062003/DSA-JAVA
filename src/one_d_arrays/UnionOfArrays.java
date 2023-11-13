package one_d_arrays;

public class UnionOfArrays {
    public static void main(String[] args) {

//        Given two arrays a[] and b[] of size n and m respectively where m >= n. The task is to find
//        union between these two arrays and print the number of elements of the union set.
//        Union of the two arrays can be defined as the set containing distinct elements from both
//        the arrays. If there are repetitions, then only one occurrence of element should be printed
//        in the union.

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {3, 4, 5, 6, 7, 8};

        int result = findUnion(a,b);
        System.out.println(result);
    }

    private static int findUnion(int[] a, int[] b) {
        int n = a.length ;
        int m = b.length;

        int unionSize = n ;


        // Check each element of array b if it's not already in array a

        for (int i = 0; i < m; i++) {
            boolean isFound = false ;
            for (int j = 0; j < n; j++) {
                if (b[i] == a[j]){
                    isFound = true;
                    break;
                }
            }

            if (!isFound){
                unionSize++ ;
            }
        }
        return unionSize ;
    }
}
