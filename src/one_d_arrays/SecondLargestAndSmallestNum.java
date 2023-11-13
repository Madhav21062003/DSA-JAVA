package one_d_arrays;

import java.util.Arrays;

public class SecondLargestAndSmallestNum {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};  // ans 4 and 2
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(arr[1]);
//        System.out.println(arr[arr.length-2]);

        System.out.println(Arrays.toString(secongLargestAndSmallest(arr)));

    }

    static  int[] secongLargestAndSmallest(int[]arr){
        Arrays.sort(arr);

      int  secondLargest = arr[arr.length-2];
      int secondSmallest = arr[1];

      int[] result = {secondLargest, secondSmallest} ;

      return  result ;

    }
}
