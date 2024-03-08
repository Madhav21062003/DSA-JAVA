package recursion.day_5;

public class MinElementInArray {
    public static void main(String[] args) {
        int[] arr = {3,4,1,2,8};
        System.out.println(minElement(arr, 0));
    }

    static int minElement(int[] arr, int idx){
        if (idx == arr.length-1)
            return arr[idx];

        return Math.min(arr[idx],minElement(arr, idx+1) );
    }
}
