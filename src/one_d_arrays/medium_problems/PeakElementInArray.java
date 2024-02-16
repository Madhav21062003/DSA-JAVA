package one_d_arrays.medium_problems;

public class PeakElementInArray {
    public static void main(String[] args) {

        int[] arr =  {1, 1, 3, 4, 2, 3, 5, 7, 0};
        System.out.println("The Peak Element in the array is "+peakElement(arr));
    }
    static int peakElement(int[]arr){

      int start = 0 ;
      int end = arr.length-1;

      int mid = start + (end - start) / 2 ;
      while (start < end){
          if (arr[mid] < arr[mid + 1])
              start = mid + 1  ;

          else
              end = mid ;

          mid = start + (end - start) / 2 ;
      }
      return start ;
    }
}
