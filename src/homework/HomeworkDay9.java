package homework;

public class HomeworkDay9 {
    public static void main(String[] args) {

        /*
        *    First Pattern:
     1
     1 2
     1 2 3
     1 2 3 4
     1 2 3 4 5
     1 2 3 4 5 6
     1 2 3 4 5 6
        * */

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
        /*
        *   Second Pattern:

    A
    A B
    A B C
    A B C D
    A B C D E

        * */

        for (char i = 'A'; i <= 'E'; i++) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println();

         /*
        *   Third Pattern:

       10
       10 11
       10 11 12
       10 11 12 13
       10 11 12 13 14
       10 11 12 13 14 15


        * */
        int count;
        for (int i = 10; i <= 15; i++) {
            for (int j = 10; j <= i; j++) {
//                 count = 10 ;
                System.out.print(j+" ");
//                count++;
            }
//            count = 0 ;
            System.out.println();
        }
        System.out.println();


         /*
        *   Fourth Pattern:

      A B C D
      A B C
      A B
      A
        * */

        for (char i = 'D'; i>= 'A'; i--){
            for (char j = 'A'; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
