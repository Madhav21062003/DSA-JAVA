package homework;

public class HomeworkDay15 {
    public static void main(String[] args) {

        // 1: Take a number n from the user and print all the even numbers between 1 and n(inclusive).
        // Do this using while and do while loop separately.

        int n1 = 20;
        int i1 = 1;
        while (i1 <= n1) {
            if (i1 % 2 == 0) {
                System.out.print(i1 + " ");
            }
            i1++;
        }
        System.out.println();

        //  2: Find the factorial of a number n using a while loop and do a while loop.
        int n2 = 5;
        int i2 = 1;
        int result = 1;
        if (n2 == 0 || n2 == 1)
            System.out.println(n2);

        else {
            while (i2 <= n2) {
                result = i2 * result;
                i2++;
            }
            System.out.println(result);
        }

        // 3: Given a number n, print all the numbers from 1 to n(inclusive) which are not divisible by 3 and 5. (use Continue here).

        int n3 = 32;
        int i3 = 1;

        while (i3 <= n3){
            if (i3 % 3 == 0 && i3 % 5 ==0){
                continue;
            }
            System.out.print(i3+" ");
            i3++;
        }
        System.out.println();


        // 4: Given a number n, print the corresponding month of it. For n=1, print Jan, n=2, print Feb…,
        // if the user puts any invalid number, don’t do anything. (Use switch here)

        int month = 7;
        switch (month){
            case 1:
                System.out.print("JAN");
                break;

            case 2:
                System.out.print("FEB");
                break;

            case 3:
                System.out.print("MARCH");
                break;

            case 4:
                System.out.print("APRIL");
                break;

            case 5:
                System.out.print("MAY");
                break;

            case 6:
                System.out.print("JUNE");
                break;

            case 7:
                System.out.print("JULY");
                break;

            case 8:
                System.out.print("AUG");
                break;

            case 9:
                System.out.print("SEPT");
                break;

            case 10:
                System.out.print("OCT");
                break;

            case 11:
                System.out.print("NOV");
                break;

            case 12:
                System.out.print("DEC");
                break;

            default:
                System.out.print("Invalid Month Number");
                break;
        }

        // 5: Print all the Capital and small letters  using a while loop. It means A-Z, then a-z.


        // 6: Give a number n, find if it is prime or not, use a while loop and break here to solve it.

    }
}
