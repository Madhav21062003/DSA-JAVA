package online_platform_problems;

public class LeapYear {
    public static void main(String[] args) {

        // Leap year Problem On GFG
        leapYear(2004);
        leapYear(2100);

    }
    // 1. If a year completely Divided by 400 -> Is A Leap Year
    // 2. else If a year is divided by 4 and Not been divided by 100 is a leap year
    // 3. else Not a Leap year

    static void leapYear(int year){

        if (year % 400 == 0)
            System.out.println(year+" is a Leap Year");

        else if (year % 4 == 0 && year % 100 != 0)
            System.out.println(year+" is a Leap Year");

        else
            System.out.println(year+" is not a Leap Year");
    }
}
