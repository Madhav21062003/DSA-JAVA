package multidimensional_arrays.day_4;

public class MajorityElement {
    public static void main(String[] args) {

    }

    public static int majorityElement(int[] nums) {
        int candidate = -1, count = 0;
        int n = nums.length;

        for(int i=0; i<n; i++){
            if(count == 0){
                count = 1;
                candidate =  nums[i];
            }
            else {
                if(candidate == nums[i]){
                    count++;
                }
                else {
                    count--;
                }
            }
        }
        return candidate;
    }
}
