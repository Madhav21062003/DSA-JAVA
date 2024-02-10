package homework;

public class HomeworkDay22 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,45,6};
        System.out.println(sumOfElements(arr));

    }

    // 1: Take elements from user input and find its sum with the help of an array.
    static int sumOfElements(int[] arr){
        int sum = 0 ;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }
}
