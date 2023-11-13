package one_d_arrays.problemsPart3;

public class SortSquares {
    public static void main(String[] args) {

        int[] arr = {-10,-3,-2,1,4,5};
//        System.out.println(Arrays.toString());
        int[] ans = sortSquares(arr);
        reverseArray(ans);
        

    }

    static void reverseArray(int[] arr){
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }
    }

    static int[] sortSquares(int[] arr){
        int n = arr.length;
        int left = 0 ;
        int right = n-1;
        int[] ans = new int[n];
        int k = 0 ;
        while (left <= right){

            if (Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left];
                left++;
            }else {
                ans[k++] = arr[right] * arr[right];

                right--;
            }
        }

        return ans;

    }

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
