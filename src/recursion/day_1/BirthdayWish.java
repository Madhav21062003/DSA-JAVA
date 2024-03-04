package recursion.day_1;

public class BirthdayWish {
    public static void main(String[] args) {

        String name =  "Madhav" ;
        birthdayWish(5,name);
    }

    static void birthdayWish(int n, String name){

        if (n==0)
            System.out.println("Happy Birthday "+name);

        else {
            System.out.println(n+" days left for "+name+" birthday");
            birthdayWish(n-1,name);
        }
    }
}
