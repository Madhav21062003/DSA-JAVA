package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HomeworkDay38 {
    public static void main(String[] args) {

    }

    static void segregate0and1(int[] arr) {
        // code here

        int start = 0, end = arr.length - 1;

        while (start < end) {
            if (arr[start] == 0)
                start++;

            else {
                if (arr[end] == 0) {
                    int temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                    start++;
                    end--;
                } else {
                    end--;
                }
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    // Using Two pointer Approach if the array is already sorted but you have to follow 1 based indexing TC = O(n)
    public static int[] twoSumNew(int[] arr, int target) {
        int i = 0, j = arr.length - 1;
        int[] ans = new int[2];
        while (j > i) {
            int sum = arr[i] + arr[j];
            if (sum == target) {
                ans[0] = i + 1;
                ans[1] = j + 1;
                break;
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }
        return ans;
    }

    public static int pairWithGivenDifference(int[] arr, int target) {
        Arrays.sort(arr);
        int start = 0, end = 1;

        if (target < 0)
            target = target * -1;

        while (end < arr.length) {
            int diff = arr[end] - arr[start];

            if (diff == target)
                return 1;

            else if (diff < target) {
                end++;

            } else
                start++;

            if (start == end)
                end++;

        }

        return 0;
    }


    // Product pair GFG
    static boolean isProduct(int[] arr, int n, long x) {
        // code here
        Arrays.sort(arr);

        ArrayList<Long> list = new ArrayList<>();

        for (long num : arr) {

            if (num == 0) {
                if (x == 0)
                    return true;
                else
                    continue;

            }
            if (x % num == 0 && list.contains(x / num)) {
                return true;
            }
            list.add(num);
        }
        return false;
    }


    //Remove Duplicates from Sorted Array
    public int removeDuplicates(ArrayList<Integer> A) {
        int n = A.size();
        int i = 0, j = 0, ans = 0;
        while (i < n) {
            while (i < n - 1 && A.get(i).equals(A.get(i + 1))) {
                i++;
            }
            Collections.swap(A, i++, j++);
            ans++;
        }
        return ans;
    }
}
