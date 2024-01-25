package one_d_arrays.basic_problems;

public class SearchElement {
    public static void main(String[] args) {
        int[] arr = {1,8,6,68,99,5,555} ;
        int key = 684 ;

        int result = searchElement(arr, key);
        if (result == -1)
            System.out.println(key+" is Not present in the array");
        else
            System.out.println(key+" is present in the array at index: "+result);
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
