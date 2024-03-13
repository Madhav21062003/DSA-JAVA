package recursion.day_7;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = {6, 3, 1, 2, 8, 9, 10, 7, 3, 10};
        mergeSort(arr, 0, arr.length-1);
        for (int j : arr) {
            System.out.print(j + " ");
        }

    }

   static void merge(int arr[], int start, int mid, int end)
    {
        int[]temp = new int[(end - start + 1)];
        int left = start, right = mid + 1, index = 0;

        while (left <= mid && right <= end)
        {
            if (arr[left] <= arr[right])
            {
                temp[index] = arr[left];
                index++; left++;
            }
            else
            {
                temp[index] = arr[right];
                index++; right++;
            }
        }

        while (left <= mid)
        {
            temp[index] = arr[left];
            index++; left++;
        }

        while (right <= end)
        {
            temp[index] = arr[right];
            index++; right++;
        }

        index = 0;
        while (start <= end)
        {
            arr[start] = temp[index];
            start++; index++;
        }
    }
    static void mergeSort(int arr[], int start, int end)
    {
        if (start == end)
            return;

        int mid = start + (end - start) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }




}
