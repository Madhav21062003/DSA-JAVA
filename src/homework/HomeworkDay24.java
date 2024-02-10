package homework;

public class HomeworkDay24 {
    public static void main(String[] args) {

//        Find the Time Complexity Big(O), Theta, Omega:

        int n = 3;
        for(int i=1;i<=n*n;i++)
            System.out.println(i);  // Tc = O(n^2)

        for(int i=1;i<=n*n;i=i+2)
            System.out.println(i);  // Tc = O(n^2)

        for(int i=1;i<=n;i++)
            for(int j=1;j<=n;j=j+5)
                System.out.println(j);   // Tc = O(n)


        for(int i=1;i<=n;i++)
            for(int j=i;j<=n;j=j++)
                System.out.println(j);  // TC = O(n^2)


        for(int i=1;i<=n;i++)    // TC = O(n)
            for(int j=1;j<=n;j=j*4)
                System.out.println(j);


        for(int i=1;i<=n;i=i*2)
            for(int j=1;j<=i;j=j++)   // tc= O(n^2)
                System.out.println(j);



    }
}
