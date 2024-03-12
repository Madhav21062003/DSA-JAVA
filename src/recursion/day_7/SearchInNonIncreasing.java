package recursion.day_7;

public class SearchInNonIncreasing {
    public static void main(String[] args) {

        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        int ans = searchElement(arr,0, arr.length, 16);
        System.out.println(ans);
    }

    static int searchElement(int[] arr, int start, int end, int key){
        if (start > end)
            return 0;

        int mid = start + (end - start) / 2;

        if (arr[mid] == key)
            return  1 ;

        else if (arr[mid] < key)
            return searchElement(arr,start,mid-1,key);

        else
            return searchElement(arr,mid+1,end,key);
    }

}
