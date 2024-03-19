package recursion.day_11;

import java.util.ArrayList;
import java.util.List;

public class ArrayPermutations {
    public static void main(String[] args) {

        // Method - 1 using extra space
//        int[] arr_1 = {1, 2, 3};
//        List<List<Integer>> ans_1 = new ArrayList<>();
//        List<Integer> temp = new ArrayList<>();
//        boolean[] visited = new boolean[arr_1.length];
//        permut(arr_1, ans_1, temp, visited);
//
//        // Printing the permutations
//        for (List<Integer> permutation : ans_1) {
//            System.out.println(permutation);
//        }



        // Method 2  ->  Without Using Extra Space
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        List<List<Integer>> ans = new ArrayList<>();
        permut2(arr, ans, 0);

        // Printing the permutations
        for (List<Integer> permutation : ans) {
            System.out.println(permutation);
        }
    }


    // Method 1
    static void permut(int[] arr, List<List<Integer>> ans, List<Integer> temp, boolean[] visited)
    {

        if (visited.length == temp.size()){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < visited.length; i++) {
            if (visited[i] == false){
                visited[i] = true;
                temp.add(arr[i]);
                permut(arr,ans,temp,visited);
                visited[i] = false;
                temp.remove(temp.size()-1);
            }
        }
    }

    // Method 2
    public static void permut2(List<Integer> arr, List<List<Integer>> ans, int index) {
        if (index == arr.size()) {
            ans.add(new ArrayList<>(arr));
            return;
        }

        for (int i = index; i < arr.size(); i++) {
            swap(arr, i, index);
            permut2(arr, ans, index + 1);
            swap(arr, i, index);
        }
    }

    public static void swap(List<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

}
