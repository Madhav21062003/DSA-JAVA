package recursion.recusriononarrays;

public class FindAllIndicesOfElement {
    public static void main(String[] args) {

        int[] arr = {1,2,3,2,2};
        findAllIndices(arr,0,2);
    }

    static void findAllIndices(int[] arr, int index, int target){
        if (index >= arr.length)
            return;

        if (arr[index] == target)
            System.out.print(index+" ");

        findAllIndices(arr,index+1, target);
    }

}
