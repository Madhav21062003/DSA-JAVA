package recursion.day_7;

public class RecursiveBinarySearch {
    public static void main(String[] args) {

        int[] arr = {3,8,11,15,20,22};
        System.out.println(search(arr,0, arr.length, 21));
    }

    static boolean search(int[] a, int start, int end, int key){

        // IF THE ELEMENT IS NOT find
       // into the array
        if (start > end)
            return false;

        int mid = start + (end - start) / 2 ;
        if (a[mid] == key)
            return true;

        else if (a[mid] < key)
            return search(a,mid+1,end,key);

        else
            return search(a,start,mid-1,key);
    }
}
