package recursion.day_5;

public class SumOfAllElement {
    public static void main(String[] args) {

        int[] arr = {1,2,3};
       int ans = sumOfAllElements(arr, 0);
        System.out.println(ans);
    }

    static int sumOfAllElements(int[] arr, int idx){
        if (idx == arr.length)
            return 0;


       return arr[idx] + sumOfAllElements(arr, idx+1);
    }
}
