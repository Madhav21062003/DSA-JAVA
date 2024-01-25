package one_d_arrays;

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {1,8,6,68,99,5,555} ;
        int key = 684 ;

        System.out.println(linerSearch(arr, key));


    }

    static int linerSearch(int[]arr, int key){

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == key)
                return i ;
        }

        return -1;
    }



}
