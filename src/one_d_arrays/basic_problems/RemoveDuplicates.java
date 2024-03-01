package one_d_arrays.basic_problems;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,2,2};
        int rd =0 ;

        for (int i = 1; i < arr.length; i++) {
            if (arr[rd] != arr[i]){
                rd++;
                arr[rd] = arr[i];
            }
        }
        System.out.println(rd+1);

    }
}
