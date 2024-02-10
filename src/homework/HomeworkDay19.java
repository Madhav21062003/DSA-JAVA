package homework;

public class HomeworkDay19 {
    public static void main(String[] args) {

        System.out.println(distributeInCircle(8,5, 2));
        System.out.println(setBits(6));
    }

    // Problem link - https://www.interviewbit.com/problems/distribute-in-circle/
    static int distributeInCircle(int A, int B, int C){

        // Here c + a make the complete circle here we do -1 bcz the item is assigned to current position person
        // % by B denotes if it is in the circle then last item is assigned to which position
        int ans = (C + A -1) % B;

        if (ans == 0)
            return B;
        else
            return ans;
    }

   // Problem link - https://www.geeksforgeeks.org/problems/set-bits0143/1
   static int setBits(int N) {
       // code here
       int binary = 0, mul = 1, count = 0;
       while (N != 0){
           int rem = N % 2;
           if (rem == 1){
               count ++;
           }
           N = N / 2 ;
           binary = binary + rem * mul;
           mul = mul * 10;
       }
       return count;

   }

    // Problem link - https://www.geeksforgeeks.org/problems/bit-difference-1587115620/1
    public static int countBitsFlip(int a, int b){

        // Your code here

        return 0;
    }


}
