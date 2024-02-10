package homework;

public class HomeworkDay22 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 45, 6};
        System.out.println(sumOfElements(arr));

        int[] avgArr = new int[18];
        avgArr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
        System.out.println(calcAvg(avgArr));

    }

    // 1: Take elements from user input and find its sum with the help of an array.
    static int sumOfElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    //    2: Calculate the average of elements in an array of size 18.
    static float calcAvg(int[] arr) {
        float avg;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        avg = sum / 18;

        return avg;
    }

    // 3: Find the index of a specific element in an array, if the element is nor present, print -1.
    static int findElementIndex(int[] arr, int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }

        return -1;
    }



    // 4: Create an array of char types and store ‘a’ to ‘z’ in it. Then print the element of the arrays.

    // 5: Find the second largest element in an array of unique elements of size n. Where n>3.


    // 6: Find the third smallest element in an array of unique elements size n. Where n>3.

    // 7: What is Byte addressable?
}
