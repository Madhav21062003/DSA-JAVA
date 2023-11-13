package one_d_arrays.problemspart4;

import java.util.Scanner;

public class QueryPrefixSum {
    public static void main(String[] args) {
        int[] arr = {2,4,1,3,6,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("The prefix Sum array is: ");

        int prefSum[] = queryPrefixSum(arr);
        System.out.println("Enter Number of queries");
        int q = sc.nextInt();
        while (q-- > 0){
            System.out.println("Enter Range");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = prefSum[r] - prefSum[l-1];
            System.out.println("Sum = "+ans);
        }

    }

    static int[] queryPrefixSum(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i-1] + arr[i];
        }

       return arr;
    }
}
