package loops.whileloops;

public class PrintOddEven {
    public static void main(String[] args) {
        int n1 = 22;
        int n2 = 23;
        int i = 1, j =1 ;

        System.out.print("Even Numbers are : ");
        while (i <= n1){
            if (i % 2 == 0){
                System.out.print(i+" ");
            }
            i++;
        }
        System.out.println();

        System.out.print("Odd Numbers are : ");
        while (j <= n2){
            if (j % 2 != 0){
                System.out.print(j+" ");
            }
            j++;
        }
        System.out.println();


    }
}
