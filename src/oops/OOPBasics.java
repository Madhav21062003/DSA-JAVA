package oops;

public class OOPBasics {
    public static void main(String[] args) {

        // Declaration of class
        Student s1 = new Student();
        // Providing values
        s1.name = "Madhav";
        s1.rollNo = 39;
        s1.percentage = 99.99;
        System.out.println(s1.name);
        System.out.println(s1.rollNo);
        System.out.println(s1.percentage);
    }

    public static class Student{

        // Creating Mutilple data type
        String name ;
        int rollNo;
        double percentage ;
    }
}
