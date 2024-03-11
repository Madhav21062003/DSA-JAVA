package recursion.day_7;

public class RecLinearSearch {
    public static void main(String[] args) {
        int[] arr= {2,4,7,3,8,12};
        boolean ans = recursiveLinearSearch(arr,18,0);
        System.out.println(ans);
    }

    static boolean recursiveLinearSearch(int[] arr, int key, int idx){
       // Base case 
        if (idx == arr.length)
            return false;
       
        // Comparing every index item with key
        if (arr[idx] == key)
            return true;

        return recursiveLinearSearch(arr,key,idx+1);
    }
}
