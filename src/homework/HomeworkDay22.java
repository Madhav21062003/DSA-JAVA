package homework;

import java.util.Scanner;

public class HomeworkDay22 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 45, 6};
        System.out.println(sumOfElements(arr));
        System.out.println(secondLargestElement(arr));

        int[] avgArr = new int[18];
        avgArr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
        System.out.println(calcAvg(avgArr));

        char[] ch = {'a', 'b', 'c', 'd', 'e', 'f'};
        displayChar(ch);

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
    static int findElementIndex(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }

        return -1;
    }


    // 4: Create an array of char types and store ‘a’ to ‘z’ in it. Then print the element of the arrays.
    static void displayChar(char[] ch) {
        Scanner sc = new Scanner(System.in);
        char[] ch1 = new char[ch.length];

        // Store 'a' to 'z' in the array
        for (int i = 0; i < ch.length; i++) {
            ch1[i] = (char) ('a' + i);
        }

        // Print the elements of the array
        System.out.println("Elements of the character array are: ");
        for (char c : ch1) {
            System.out.print(c + " ");
        }
    }

    // 5: Find the second largest element in an array of unique elements of size n. Where n>3.
    static int secondLargestElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        // Step -1  find the maximum element of the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        // comapre one by one the elemet which ig greater than the rest of elemets excet max element
        for (int i = 0; i < arr.length; i++) {
            if (max != arr[i])
                secondMax = Math.max(secondMax, arr[i]);
        }

        return secondMax;
    }

    // 6: Find the third smallest element in an array of unique elements size n. Where n>3.


    // 7: What is Byte addressable?
}
