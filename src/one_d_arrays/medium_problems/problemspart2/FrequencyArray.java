package one_d_arrays.medium_problems.problemspart2;

public class FrequencyArray {
    public static void main(String[] args){

        int[] arr1 =  {1,2,3,4,5,6,7};
        int[] arr = {100};
        int[] freq =makeFrequencyArray(arr);



    }

    static int[] makeFrequencyArray(int[] arr){
        int[] freq = new int[100];

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++ ;
        }
        return freq ;
    }
}
