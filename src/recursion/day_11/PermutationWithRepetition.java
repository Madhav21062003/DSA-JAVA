package recursion.day_11;

import java.util.ArrayList;
import java.util.List;

public class PermutationWithRepetition {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(2);
        List<List<Integer>> ans = new ArrayList<>();

        permut(arr,ans,0);


        System.out.println(ans);

    }

    public static void permut(List<Integer> arr, List<List<Integer>> ans, int index) {
        if (index == arr.size()) {
            ans.add(new ArrayList<>(arr));
            return;
        }

        boolean[] use = new boolean[21];
        for (int i = index; i < arr.size(); i++) {
            if (use[arr.get(i) + 10 ] == false){
                swap(arr, i, index);
                permut(arr, ans, index + 1);
                swap(arr, i, index);

                use[arr.get(i) + 10] = true;
            }
        }
    }

    public static void swap(List<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }
}
