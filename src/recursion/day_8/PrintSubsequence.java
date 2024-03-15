package recursion.day_8;

import java.util.ArrayList;
import java.util.List;

public class PrintSubsequence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        subseq(arr, 0, arr.length, ans, temp);

        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }

    static void subseq(int[] arr, int index, int n, List<List<Integer>> ans, List<Integer> temp) {
        if (index == n) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(arr[index]);
        subseq(arr, index + 1, n, ans, temp);
        temp.remove(temp.size() - 1);
        subseq(arr, index + 1, n, ans, temp);
    }
}
