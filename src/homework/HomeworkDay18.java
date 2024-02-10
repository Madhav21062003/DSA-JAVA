package homework;

public class HomeworkDay18 {
    public static void main(String[] args) {

//        System.out.println(calcCube(3));
//        System.out.println(reverseNum(123));
//        valueExchange(1,2,3);
//        swapVariables(10,20);
//        printString(5);
        System.out.println();
        calcCombination(5,2);

    }

    //    1: Find the cube of a number using Function.
    static int calcCube(int n ){
        return n*n*n;
    }

    // 2: Reverse a number n using Function, Constraints: -5000<=n<=5000
    static int reverseNum(int n){
        int  revNum = 0 , rem;

        while (n != 0){
            rem = n % 10;

            // Check if the Overflow occur  then return to 1
            if (revNum > (Integer.MAX_VALUE-rem) / 100)
                return 0;

            revNum = revNum * 10 + rem;
            n = n / 10;
        }
        return revNum;
    }

    // 3: There are three numbers a,b,c. Put the value of a into b, put value of b into c and put value of c into a. Do it using Function.
    static void valueExchange(int a, int b, int c){

        int temp = a;
        a = b;
        b = c ;
        c = temp;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);

    }

    // 4: Swap 2 numbers a, b without using extra variables. Range of -10000<=a,b<=100000.
    static void swapVariables(int a, int b){

        System.out.println("Before Swapping a = "+a);
        System.out.println("Before Swapping b = "+b);

        // ex a = 10,  b = 20
        a = a + b;  // a = 10 + 20 = 30
        b = a - b;  // b = 30 - 20 = 10
        a = a - b ;  // a = 30 - 10 = 20

        System.out.println("After Swapping a = "+a);
        System.out.println("After Swapping b = "+b);
    }

    // 5: Print “Hello Coder Army” n times using Function.
    static void printString(int n){

        for (int i=0; i<n; i++)
            System.out.println("Hello");
    }

    // 6: Given two numbers n, r. Find nCr (Combination). Use Function here.
    static int calcCombination(int n , int r){
        int fact1 = 1, fact2 = 1, fact3 = 1 , diffrence = n-r;
        int ans ;

        for (int i = n; i >0 ; i--) {
            fact1 = fact1 * i;
        }


        for (int i = r; i >0 ; i--) {
            fact2 = fact2 * i;
        }


        for (int i = diffrence; i >0 ; i--) {
            fact3 = fact3 * i;
        }

       ans = (fact1) / ( (fact2) * (fact3) ) ;
      return ans;
    }
}
