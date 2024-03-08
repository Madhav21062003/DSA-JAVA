package recursion.day_5;

public class MaxElement {
    public static void main(String[] args) {

        int[]  arr = {1,59,4,89,3};
        System.out.println(maxElement(arr,0));
    }

    static int maxElement(int[] arr, int idx){
        if (idx == arr.length-1)
            return arr[idx];

        return Math.max(arr[idx],maxElement(arr,idx+1) );
    }
}
