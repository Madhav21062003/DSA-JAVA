package one_d_arrays.medium_problems;

public class GetSingleElement {
    public static void main(String[] args) {

        int[] arr = {4,4,5,1,2,1,2};
        System.out.println("The Single occurring Element from the array is = "+getSingleElement(arr));
    }

    public static int getSingleElement(int []nums){
        // Write your code here.
        int n = nums.length;

        for(int i = 0; i<n; i++){
            int num = nums[i];
            int count = 0 ;

            for(int j=0; j<n; j++){
                if(nums[j] == num){
                    count = count + 1 ;
                }
            }

            if(count == 1){
                return num;
            }
        }

        return -1;
    }
}
