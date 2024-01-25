package one_d_arrays;

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {1,8,6,68,99,5,555} ;
        int key = 684 ;

        System.out.println(linerSearch(arr, key));

        int result = searchElement(arr, key);
        if (result == -1)
            System.out.println(key+" is Not present in the array");
        else
            System.out.println(key+" is present in the array at index: "+result);
    }

    static int linerSearch(int[]arr, int key){

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == key)
                return i ;
        }

        return -1;
    }

    static int searchElement(int[] arr, int key){
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key){
                index = i;
                break;
            }
        }
        return index;
    }

}
