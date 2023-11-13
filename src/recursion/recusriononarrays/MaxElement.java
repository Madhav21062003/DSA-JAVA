package recursion.recusriononarrays;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {3,10,3,2,5};
       int result =  getMaxValue(arr, 0);
        System.out.println("The maximum element in the array = "+result);
    }

    static int getMaxValue(int[]arr,int index){
        // base case
        if (index == arr.length-1)
            return arr[index];


        // small problem -> idx+1, end of the array -> max -> return max
        int smallAns = getMaxValue(arr, index+1);

        // self work
       return Math.max(arr[index], smallAns);

    }
}
